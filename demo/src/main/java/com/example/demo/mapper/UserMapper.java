package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.User;

@Mapper
public interface UserMapper {
	List<User> findAll();

	User findById(int id);

	void insert(User user);

	void update(User user);

	void delete(int id);

}
