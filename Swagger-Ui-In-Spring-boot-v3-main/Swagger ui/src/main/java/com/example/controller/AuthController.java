package com.example.controller;


import com.example.model.LoginDto;
import com.example.model.TokenResponeDto;
import com.example.model.UserModel;
import com.example.service.AuthenticationUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController{


    @Autowired
    private AuthenticationUserService authenticationUserService;

    @PostMapping("/register")
    public String registerUser(@RequestBody UserModel model) {
        return authenticationUserService.registerNewUser(model);
    }

    @PostMapping("/login")
    public ResponseEntity<?> loginUser(@RequestBody LoginDto login) {
        return ResponseEntity.ok().header(HttpHeaders.SET_COOKIE, authenticationUserService.loginUser(login).toString()).build();
    }


}
