package com.mongkhonapi.crud.service;

import com.mongkhonapi.crud.entity.User;

import java.util.List;

public interface UserService {

    User save(User request);
    List<User> findAll();
    User findById(Integer id);
    void deleteUserById(Integer id);
}
