package com.yaml_oauth2.practice.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.yaml_oauth2.practice.PracticeApplication;
import com.yaml_oauth2.practice.datamodel.User;
import com.yaml_oauth2.practice.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Override
	public User createUser(User user) {
		PracticeApplication.USERS.add(user);
		return user;
	}

	@Override
	public Optional<User> getUser(String id) {
		return PracticeApplication.USERS.stream().filter(user -> user.getId().equals(id)).findFirst();
	}

	@Override
	public List<User> getUsers() {
		return PracticeApplication.USERS;
	}

	@Override
	public void deleteUser(String id) {
		PracticeApplication.USERS.removeIf(user -> user.getId().equals(id));
	}

}
