package com.example.spring_docker_template.service;

import com.example.spring_docker_template.domain.User;
import com.example.spring_docker_template.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
      private final UserRepository repository;

      @Override
      public List<User> getAll() {
            return repository.findAll();
      }

      @Override
      public void save(User user) {
            repository.save(user);
      }
}
