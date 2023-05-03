package com.example.spring_docker_template.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="users")
@NoArgsConstructor
public class User {
      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      private Long id;

      private String username;

      public User(String username) {
            this.username = username;
      }
}
