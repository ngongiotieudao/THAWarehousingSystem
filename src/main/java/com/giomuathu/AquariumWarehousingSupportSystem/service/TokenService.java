package com.giomuathu.AquariumWarehousingSupportSystem.service;

import com.giomuathu.AquariumWarehousingSupportSystem.model.request.JwtRequest;
import com.giomuathu.AquariumWarehousingSupportSystem.model.response.JwtResponse;

public interface TokenService {
    String getRefreshTokenById(Long id);

    JwtResponse generateToken(JwtRequest authenticationRequest) throws Exception;
}
