package com.restback.todolist.model.service;

import java.util.List;

import com.restback.todolist.model.dto.Todo;

public interface TodoService {
	public Todo search(int no);

	public List<Todo> searchAll();

	public List<Todo> searchUserTodoList(int no);

	public void insert(Todo todo);

	public void update(Todo todo);

	public void delete(int no);
}
