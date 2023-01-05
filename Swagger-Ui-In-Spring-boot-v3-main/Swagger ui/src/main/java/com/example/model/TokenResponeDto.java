package com.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TokenResponeDto {

    private String token;

    public TokenResponeDto(String token) {
        this.token = token;
    }

    private String type = "Bearer";

}
