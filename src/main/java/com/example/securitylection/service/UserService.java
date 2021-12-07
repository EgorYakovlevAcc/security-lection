package com.example.securitylection.service;

import com.example.securitylection.model.User;

import java.util.List;

public interface UserService {
    void save(User user);

    List<User> getAllUsers();
}
