package com.example.spring_docker_template.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class IndexController {
      @GetMapping
      public String getIndex() {
            return "Hello world";
      }
}
