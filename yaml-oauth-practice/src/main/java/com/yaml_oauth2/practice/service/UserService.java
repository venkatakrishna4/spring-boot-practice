package com.yaml_oauth2.practice.service;

import java.util.List;
import java.util.Optional;

import com.yaml_oauth2.practice.datamodel.User;

public interface UserService {
	
	User createUser(User user);
	Optional<User> getUser(String id);
	List<User> getUsers();
	void deleteUser(String id);
}
