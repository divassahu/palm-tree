package com.example.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Entity
@Getter@Setter
@NoArgsConstructor@AllArgsConstructor
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;
    private String password;
    private String email;


    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Role> roles;


}
