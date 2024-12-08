package com.javaspring.course.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.javaspring.course.entities.Order;
import com.javaspring.course.entities.User;
import com.javaspring.course.enums.OrderStatus;
import com.javaspring.course.repositories.OrderRepository;
import com.javaspring.course.repositories.UserRepository;

@Configuration
@Profile(value = "test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {
		User user1 = new User(null, "User Test Number 1", "user1@gmail.com", "988888888", "123456");
		User user2 = new User(null, "User Test Number 2", "user2@gmail.com", "977777777", "123456");
		userRepository.saveAll(Arrays.asList(user1,user2));
		
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"),OrderStatus.PAID ,user1);
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT,user2);
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.DELIVERED,user1);
		orderRepository.saveAll(Arrays.asList(o1,o2,o3));
		
	}
}