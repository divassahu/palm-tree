package com.example.config.jwt;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseCookie;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.util.WebUtils;

import java.util.Date;

@Component
public class JwtAuthencationUtils {


    @Value("${jwt.security.expiration}")
    private Long JWT_EXPRATION;

    @Value("${jwt.security.cookie}")
    private String JWT_COOKIE;
    private final String JWT_SECERT = "lsdho9l32dkdiuvn";

    public String createJwtToken(String username) {

        return Jwts.builder()
                .setSubject(username)
                .setIssuer("masai school")
                .setIssuedAt(new Date())
                .setExpiration(new Date(new Date().getTime() + this.JWT_EXPRATION))
                .signWith(SignatureAlgorithm.HS512 , this.JWT_SECERT)
                .compact();
    }



    public Boolean validateToken(String token) {

        try {
            Jwts.parser().setSigningKey(JWT_SECERT).parseClaimsJws(token);
            return true;
        }
        catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }

    }


    public String getTokenFromHttpCookie(HttpServletRequest request) {

        Cookie cookie = WebUtils.getCookie(request, JWT_COOKIE);

        if(cookie != null) {
            return cookie.getValue();
        }

        return null;
    }

    public String getUserNameFromToken(String token) {


        return Jwts.parser()
                .setSigningKey(this.JWT_SECERT)
                .parseClaimsJws(token)
                .getBody()
                .getSubject();
    }


    public ResponseCookie createCookie(Authentication authentication) {

        String token = createJwtToken(authentication.getName());

        return ResponseCookie.from(JWT_COOKIE , token)
                .httpOnly(true)
                .maxAge(JWT_EXPRATION)
                .path("/")
                .httpOnly(true)
                .build();
    }









}
