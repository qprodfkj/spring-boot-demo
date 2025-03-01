package com.example.demo.service;

import com.example.demo.mapper.UserMapper;
import com.example.demo.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
	private final UserMapper userMapper;

	public UserService(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

	public List<User> getAllUsers() {
		return userMapper.findAll();
	}

	public User getUserById(int id) {
		return userMapper.findById(id);
	}

	public void createUser(User user) {
		userMapper.insert(user);
	}

	public void updateUser(User user) {
		userMapper.update(user);
	}

	public void deleteUser(int id) {
		userMapper.delete(id);
	}
}
