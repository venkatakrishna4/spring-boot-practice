package com.yaml_oauth2.practice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yaml_oauth2.practice.datamodel.User;
import com.yaml_oauth2.practice.service.UserService;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

	private UserService userService;
	
	UserController(UserService userService){
		this.userService = userService;
	}

	@PostMapping
	public ResponseEntity<User> createUser(@RequestBody User user) {
		User createdUser = userService.createUser(user);
		return new ResponseEntity<User>(createdUser, HttpStatus.CREATED);
	}

	@GetMapping("/{id}")
	public ResponseEntity<User> getUser(@PathVariable("id") String id) {
		Optional<User> user = userService.getUser(id);
		return ResponseEntity.ok(user.orElseThrow(() -> new UsernameNotFoundException("No user found for ID: " + id)));
	}

	@GetMapping
	public ResponseEntity<List<User>> getUsers() {
		List<User> users = userService.getUsers();
		return ResponseEntity.ok(users);
	}

	@DeleteMapping("/{id}")
	public void deleteUser(@PathVariable("id") String id) {
		userService.deleteUser(id);
	}
}
