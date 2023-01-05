package com.example.service.impl;

import com.example.config.jwt.JwtAuthencationUtils;
import com.example.model.LoginDto;
import com.example.model.Role;
import com.example.model.TokenResponeDto;
import com.example.model.UserModel;
import com.example.repository.RoleRepo;
import com.example.repository.UserRepo;
import com.example.service.AuthenticationUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseCookie;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class AuthencationUserServiceImpl implements AuthenticationUserService {

    @Autowired
    private PasswordEncoder encoder;
    @Autowired
    private UserRepo userRepo;
    @Autowired
    private RoleRepo roleRepo;
    @Autowired
    private AuthenticationManager manager;
    @Autowired
    private JwtAuthencationUtils jwtAuthencationUtils;


    @Override
    public String registerNewUser(UserModel userModel) {


        if(userRepo.existsByEmail(userModel.getEmail())) {
            return "Username is already taken!";
        }

        userModel.setPassword(encoder.encode(userModel.getPassword()));

        Role role = roleRepo.findByName("ROLE_USER").orElseThrow(() -> new RuntimeException("role not found"));


        userModel.setRoles(Collections.singletonList(role));

        userRepo.save(userModel);
        return "sucessfully registerd";
    }

    @Override
    public ResponseCookie loginUser(LoginDto loginDto) {

        UserModel user = userRepo.findByEmail(loginDto.getEmail()).orElseThrow(() -> new RuntimeException("invalid username"));

        Authentication authentication = manager.authenticate(new UsernamePasswordAuthenticationToken(loginDto.getEmail() , loginDto.getPassword()));

        SecurityContextHolder.getContext().setAuthentication(authentication);

        ResponseCookie cookie = jwtAuthencationUtils.createCookie(authentication);

        return cookie;
    }
}
