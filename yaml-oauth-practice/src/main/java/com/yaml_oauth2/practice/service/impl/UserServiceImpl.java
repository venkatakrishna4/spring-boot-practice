package com.yaml_oauth2.practice.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.yaml_oauth2.practice.datamodel.User;
import com.yaml_oauth2.practice.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Override
	public User createUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<User> getUser(String id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser(String id) {
		// TODO Auto-generated method stub
		
	}

}
