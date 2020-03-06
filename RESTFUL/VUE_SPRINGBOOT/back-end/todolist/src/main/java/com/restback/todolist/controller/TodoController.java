package com.restback.todolist.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restback.todolist.model.dto.Todo;
import com.restback.todolist.model.service.TodoService;
import com.restback.todolist.utils.HandlerUtils;

import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = { "*" }, maxAge = 6000)
@RestController
public class TodoController {

    @Autowired
    private TodoService service;
    private HandlerUtils handler = new HandlerUtils();

    @ApiOperation("전체 Todo 목록을 조회하는 기능")
    @GetMapping("/Todo")
    public ResponseEntity<Map<String, Object>> searchAll() {
        List<Todo> list = service.searchAll();
        return handler.handleSuccess(list);
    }

    @ApiOperation("no에 따른 Todo 정보 조회하는 기능")
    @GetMapping("/Todo/{no}")
    public ResponseEntity<Map<String, Object>> search(@PathVariable int no) {
        Todo todo = service.search(no);
        return handler.handleSuccess(todo);
    }

    @PostMapping("/Todo")
    @ApiOperation("Todo 정보 등록")
    public ResponseEntity<Map<String, Object>> insert(@RequestBody Todo todo) {
        service.insert(todo);
        return handler.handleSuccess("");
    }

    @ApiOperation("Todo 정보 삭제")
    @DeleteMapping("/Todo/{no}")
    public ResponseEntity<Map<String, Object>> delete(@PathVariable int no) {
        service.delete(no);
        return handler.handleSuccess("삭제 완료");
    }

    @ApiOperation("Todo 정보 수정")
    @PutMapping("/Todo")
    public ResponseEntity<Map<String, Object>> update(@RequestBody Todo todo) {
        service.update(todo);
        return handler.handleSuccess("수정 완료");
    }
}
