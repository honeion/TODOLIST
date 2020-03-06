package com.restback.todolist.model.service;

import java.util.List;

import com.restback.todolist.model.dto.User;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Override
	public User search(int no) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> searchAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int no) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean login() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String findID() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String findPassword() {
		// TODO Auto-generated method stub
		return null;
	}

}
