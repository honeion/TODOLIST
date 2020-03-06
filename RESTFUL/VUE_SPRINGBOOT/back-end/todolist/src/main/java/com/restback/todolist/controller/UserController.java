package com.restback.todolist.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restback.todolist.model.dto.User;
import com.restback.todolist.model.service.UserService;
import com.restback.todolist.utils.HandlerUtils;

import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = { "*" }, maxAge = 6000)
@RestController
public class UserController {

	@Autowired
	private UserService service;
	
	private HandlerUtils handler = new HandlerUtils();

	@ApiOperation("전체 User 목록을 조회하는 기능")
	@GetMapping("/User")
	public ResponseEntity<Map<String, Object>> searchAll() {
		List<User> list = service.searchAll();
		return (list == null) ? handler.handleFail("no data", HttpStatus.NO_CONTENT) : handler.handleSuccess(list);
	}

	@ApiOperation("no에 따른 User 정보 조회하는 기능")
	@GetMapping("/User/{no}")
	public ResponseEntity<Map<String, Object>> search(@PathVariable int no) {
		User user = service.search(no);
		return handler.handleSuccess(user);
	}

	@PostMapping("/User")
	@ApiOperation("User 정보 등록")
	public ResponseEntity<Map<String, Object>> insert(@RequestBody User user) {
		service.insert(user);
		return handler.handleSuccess("");
	}

	@ApiOperation("User 정보 삭제")
	@DeleteMapping("/User/{no}")
	public ResponseEntity<Map<String, Object>> delete(@PathVariable int no) {
		service.delete(no);
		return handler.handleSuccess("삭제 완료");
	}

	@ApiOperation("User 정보 수정")
	@PutMapping("/User")
	public ResponseEntity<Map<String, Object>> update(@RequestBody User user) {
		service.update(user);
		return handler.handleSuccess("수정 완료");
	}

}
