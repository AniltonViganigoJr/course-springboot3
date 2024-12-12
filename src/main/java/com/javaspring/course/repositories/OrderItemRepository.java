package com.javaspring.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaspring.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}