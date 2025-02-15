package com.giomuathu.AquariumWarehousingSupportSystem.model.request;

import lombok.Data;

@Data
public class LoginUserRequest {
    private String username;
    private String password;
}
