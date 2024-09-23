package com.yaml_oauth2.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.yaml_oauth2.practice.datamodel.User;

@SpringBootApplication
public class PracticeApplication {

	public static final List<User> USERS = new ArrayList<>();

	public static void main(String[] args) {
		SpringApplication.run(PracticeApplication.class, args);

		// Initialize dummy users
		PracticeApplication.initUsers();
	}

	private static void initUsers() {
		USERS.add(User.builder().id(UUID.randomUUID().toString()).email("test@gmail.com").name("Test")
				.password("password").build());
	}

}
