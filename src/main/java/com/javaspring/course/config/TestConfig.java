package com.javaspring.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.javaspring.course.entities.User;
import com.javaspring.course.repositories.UserRepository;

@Configuration
@Profile(value = "test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User user1 = new User(null, "User Test Number 1", "user1@gmail.com", "988888888", "123456");
		User user2 = new User(null, "User Test Number 2", "user2@gmail.com", "977777777", "123456");
		userRepository.saveAll(Arrays.asList(user1,user2));
	}
}