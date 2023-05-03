package com.example.spring_docker_template.web;


import com.example.spring_docker_template.domain.User;
import com.example.spring_docker_template.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class IndexController {

      private final UserService userService;

      @Value("${app.home.title}")
      private String title;



      @GetMapping
      public String getIndex() {
            List<User> all = userService.getAll();
            String allUsers = all.stream()
                  .map(User::getUsername)
                  .collect(Collectors.joining(", "));
            return "Hello world (title : " + title + ")"
                  + "all users from db : " + allUsers;
      }

      @GetMapping("/add")
      public String add() {
            String username = UUID.randomUUID().toString();
            userService.save(new User(username));
            return username;
      }
}
