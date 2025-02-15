package com.giomuathu.AquariumWarehousingSupportSystem.service.impl;


import com.giomuathu.AquariumWarehousingSupportSystem.entity.AccountEntity;
import com.giomuathu.AquariumWarehousingSupportSystem.model.request.CreateUserRequest;
import com.giomuathu.AquariumWarehousingSupportSystem.model.request.LoginUserRequest;
import com.giomuathu.AquariumWarehousingSupportSystem.repository.UserRepository;
import com.giomuathu.AquariumWarehousingSupportSystem.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
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
}
