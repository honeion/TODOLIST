package com.restback.todolist.model.service;

import java.util.List;

import com.restback.todolist.model.dao.TodoDao;
import com.restback.todolist.model.dto.Todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TodoServiceImpl implements TodoService {

	@Autowired
	TodoDao dao;

	@Override
	public Todo search(int no) {
		try {
			Todo todo = dao.search(no);
			return todo;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Todo> searchAll() {
		try {
			List<Todo> list = dao.searchAll();
			return list;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void insert(Todo todo) {
		try {
			dao.insert(todo);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void update(Todo todo) {
		try {
			dao.update(todo);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void delete(int no) {
		try {
			dao.delete(no);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Todo> searchUserTodoList(int no) {
		try {
			List<Todo> list = dao.searchUserTodoList(no);
			return list;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
