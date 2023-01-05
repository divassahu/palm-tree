package com.example.service;

import com.example.model.LoginDto;
import com.example.model.TokenResponeDto;
import com.example.model.UserModel;
import org.springframework.http.ResponseCookie;

public interface AuthenticationUserService {

    String registerNewUser(UserModel userModel);
    ResponseCookie loginUser(LoginDto loginDto);
}