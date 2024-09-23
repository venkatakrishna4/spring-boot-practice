package com.yaml_oauth2.practice;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.yaml_oauth2.practice.datamodel.User;

@SpringBootApplication
public class PracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(PracticeApplication.class, args);
		
		// Initialize dummy users
	}
	
	private static void initUsers() {
		return List.of(User.builder());
	}

}
