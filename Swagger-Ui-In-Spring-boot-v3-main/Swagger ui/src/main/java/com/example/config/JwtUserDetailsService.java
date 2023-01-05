package com.example.config;

import com.example.model.Role;
import com.example.model.UserModel;
import com.example.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Collection;
import java.util.stream.Collectors;


@Component
public class JwtUserDetailsService implements UserDetailsService {


    @Autowired
    private UserRepo userRepo;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        UserModel user = userRepo.findByEmail(username).orElseThrow(() ->
                new RuntimeException("user not found"));

        return new User(user.getEmail() , user.getPassword() , addRole(user.getRoles()));
    }

    public Collection<GrantedAuthority> addRole(List<Role> roleList) {


        return roleList
                .stream()
                .map(role -> new SimpleGrantedAuthority(role.getName()))
                .collect(Collectors.toList());
    }
}
