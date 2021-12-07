package com.example.securitylection.controller;

import com.example.securitylection.model.User;
import com.example.securitylection.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1.0/registration")
public class RegistrationController {
    @Autowired
    private UserService userService;

    @PostMapping("/")
    public String signUpUser(@RequestBody User user) {
        userService.save(user);
        return "OK";
    }
}
