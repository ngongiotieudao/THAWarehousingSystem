package com.giomuathu.AquariumWarehousingSupportSystem.service.impl;

import com.giomuathu.AquariumWarehousingSupportSystem.entity.AccountEntity;
import com.giomuathu.AquariumWarehousingSupportSystem.model.request.CreateUserRequest;
import com.giomuathu.AquariumWarehousingSupportSystem.model.request.LoginUserRequest;
import com.giomuathu.AquariumWarehousingSupportSystem.repository.UserRepository;
import com.giomuathu.AquariumWarehousingSupportSystem.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import java.io.UnsupportedEncodingException;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    UserRepository userRepository;

    private JavaMailSender mailSender;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, JavaMailSender mailSender) {
        this.userRepository = userRepository;
        this.mailSender = mailSender;
    }

    @Override
    public boolean createUser(CreateUserRequest userRequest) {
        ModelMapper mapper = new ModelMapper();
        AccountEntity userEntity = mapper.map(userRequest, AccountEntity.class);

        if (userRepository.getByUsername(userRequest.getUsername()).isPresent()) {
            throw new RuntimeException("Username existed");
        }
        try {
            userRepository.save(userEntity);
            return true;
        } catch (Exception exception) {
            return false;
        }
    }

    @Override
    public boolean login(LoginUserRequest loginUserRequest) {
        Optional<AccountEntity> userEntity = userRepository.getByUsernameAndPassword(loginUserRequest.getUsername(), loginUserRequest.getPassword());
        return userEntity.isPresent();
    }

    @Override
    public boolean forgotPassword(String email, String token) {
        Optional<AccountEntity> accountEntity = userRepository.getFirstByEmail(email);
        if (accountEntity.isPresent()) {
            AccountEntity account = accountEntity.get();
            account.setToken(token);
            userRepository.save(account);
            try {
                sendEmail(email, token);
            } catch (MessagingException | UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            return true;
        }
        return false;
    }

    @Override
    public boolean changePassword(String email, String newPassword, String token) {
        Optional<AccountEntity> accountEntity = userRepository.getFirstByEmail(email);
        if (accountEntity.isPresent()) {
            AccountEntity account = accountEntity.get();
            if (account.getToken().equals(token)) {
                account.setPassword(newPassword);
                userRepository.save(account);
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public void sendEmail(String recipientEmail, String token) throws MessagingException, UnsupportedEncodingException {
        MimeMessage message = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message);

        helper.setFrom("contact@shopme.com", "Shopme Support");
        helper.setTo(recipientEmail);

        String subject = "Here's the link to reset your password";

        String content = "<p>Hello,</p>"
                + "<p>You have requested to reset your password.</p>"
                + "<p>Token to reset your password " + token + ":</p>"
                + "<br>"
                + "<p>Ignore this email if you do remember your password, "
                + "or you have not made the request.</p>";

        helper.setSubject(subject);

        helper.setText(content, true);

        mailSender.send(message);
    }
}
