package com.restback.todolist.model.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.restback.todolist.model.dto.User;

@Mapper
public interface UserDao {
	public User search(int no);
	public List<User> searchAll();
	public void insert(User user);
	public void update(User user);
	public void delete(int no);
}