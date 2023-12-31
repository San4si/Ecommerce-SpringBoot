package com.uniao.loja.services.auth;

import com.uniao.loja.dto.SignupRequest;
import com.uniao.loja.dto.UserDto;

public interface AuthService {

    UserDto createUser(SignupRequest signupRequest);

    Boolean hasUserWithEmail(String email);
}
