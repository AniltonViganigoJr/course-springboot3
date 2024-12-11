package com.javaspring.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaspring.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}