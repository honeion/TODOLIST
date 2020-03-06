package com.restback.todolist.model.service;

import java.util.List;

import com.restback.todolist.model.dto.User;

public interface UserService {
	public User search(int no);

	public List<User> searchAll();

	public void insert(User user);

	public void update(User user);

	public void delete(int no);

	public boolean login();

	public String findID();

	public String findPassword();
}
