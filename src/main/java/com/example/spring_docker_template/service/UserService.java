package com.example.spring_docker_template.service;

import com.example.spring_docker_template.domain.User;

import java.util.List;

public interface UserService {

    List<User> getAll();

    void save(User user);
}
