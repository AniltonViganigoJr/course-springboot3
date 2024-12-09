package com.javaspring.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaspring.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}