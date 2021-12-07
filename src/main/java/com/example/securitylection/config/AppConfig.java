package com.example.securitylection.config;

import com.example.securitylection.controller.filter.JwtFilter;
import com.example.securitylection.repo.UserRepository;
import com.example.securitylection.service.CustomUserDetailServiceImpl;
import com.example.securitylection.service.JWTUtils;
import com.example.securitylection.service.UserService;
import com.example.securitylection.service.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class AppConfig {
    @Bean
    public UserService userService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        return new UserServiceImpl(userRepository, passwordEncoder);
    }

    @Bean
    public UserDetailsService customUserDetailService(UserRepository userRepository) {
        return new CustomUserDetailServiceImpl(userRepository);
    }

    @Bean
    public JwtFilter jwtFilter() {
        return new JwtFilter();
    }

    @Bean
    public JWTUtils jwtUtils() {
        return new JWTUtils();
    }
}
