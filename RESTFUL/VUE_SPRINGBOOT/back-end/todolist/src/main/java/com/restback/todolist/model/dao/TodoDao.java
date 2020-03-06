package com.restback.todolist.model.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.restback.todolist.model.dto.Todo;

@Mapper
public interface TodoDao {
	public Todo search(int no);

	public List<Todo> searchAll();

	public List<Todo> searchUserTodoList(int no);

	public void insert(Todo todo);

	public void update(Todo todo);

	public void delete(int no);
}