package com.example.repository;

import com.example.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepo extends JpaRepository<Role, Integer> {

     Optional<Role> findByName(String name);

     Boolean existsByName(String name);

}
