package com.javaspring.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaspring.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}