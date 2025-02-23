package com.giomuathu.AquariumWarehousingSupportSystem.service;

import com.giomuathu.AquariumWarehousingSupportSystem.model.response.UserResponse;
import com.giomuathu.AquariumWarehousingSupportSystem.model.request.CreateUserRequest;
import com.giomuathu.AquariumWarehousingSupportSystem.model.request.LoginUserRequest;

public interface UserService {
    boolean createUser(CreateUserRequest userRequest);

    boolean login(LoginUserRequest loginUserRequest);

    boolean forgotPassword(String email, String token);

    boolean changePassword(String email, String newPassword, String token);
}
