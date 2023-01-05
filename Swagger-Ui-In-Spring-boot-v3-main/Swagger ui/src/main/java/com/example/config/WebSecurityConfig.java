package com.example.config;


import com.example.config.jwt.JwtAuthenticationFilter;
import com.example.config.jwt.JwtEntryPoint;
import com.example.model.Role;
import com.example.repository.RoleRepo;
import jakarta.annotation.PostConstruct;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
public class WebSecurityConfig {


    @Autowired
    private JwtEntryPoint entryPoint;
    @Autowired
    private JwtAuthenticationFilter jwtAuthenticationFilter;

    @Autowired
    private RoleRepo roleRepo;

    @Bean
    public PasswordEncoder encoder(){


        if(!roleRepo.existsByName("ROLE_USER")) {
            Role role = new Role();
            role.setName("ROLE_USER");
            roleRepo.save(role);
        }


        return new BCryptPasswordEncoder();
    }



    @Bean
    public AuthenticationManager getManagaer(AuthenticationConfiguration configuration) throws Exception {
        return configuration.getAuthenticationManager();
    }

    @Bean
    public SecurityFilterChain myFilterChain(HttpSecurity http) throws Exception{

        http.csrf().disable();
        http.authorizeHttpRequests(auth -> auth.requestMatchers("/auth/**" , "/entries" , "/v3/api-docs/**", "/swagger-ui/**").permitAll()
                        .anyRequest().authenticated());
        http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
        http.exceptionHandling().authenticationEntryPoint(entryPoint);
        http.httpBasic().disable();
        http.formLogin().disable();

        http.addFilterBefore(jwtAuthenticationFilter , UsernamePasswordAuthenticationFilter.class);

        return http.build();
    }
}
