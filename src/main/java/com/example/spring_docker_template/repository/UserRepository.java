package com.example.spring_docker_template.repository;

import com.example.spring_docker_template.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
