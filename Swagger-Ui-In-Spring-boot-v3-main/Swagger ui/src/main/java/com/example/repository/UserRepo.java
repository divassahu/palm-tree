package com.example.repository;

import com.example.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<UserModel, String> {

    Optional<UserModel> findByEmail(String username);
    Boolean existsByEmail(String username);

}
