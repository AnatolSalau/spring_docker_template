package com.example.spring_docker_template.web;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class IndexController {

      @Value("${app.home.title}")
      private String title;

      @GetMapping
      public String getIndex() {
            return "Hello world (title : " + title + ")";
      }
}
