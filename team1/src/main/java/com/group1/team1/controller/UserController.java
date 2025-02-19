package com.group1.team1.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.group1.team1.entity.User;
import com.group1.team1.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {

	 private final UserService userService;

	    public UserController(UserService userService) {
	        this.userService = userService;
	    }

	    // 모든 사용자 조회 (GET /api/users)
	    @GetMapping
	    public ResponseEntity<List<User>> getAllUsers() {
	        List<User> users = userService.getAllUsers();
	        return ResponseEntity.ok(users);
	    }

	    // 사용자 생성 (POST /api/users)
	    @PostMapping
	    public ResponseEntity<User> createUser(@RequestBody User user) {
	        User savedUser = userService.createUser(user);
	        return ResponseEntity.ok(savedUser);
	    }
	
}
