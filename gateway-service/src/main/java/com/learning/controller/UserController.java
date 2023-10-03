package com.learning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.client.UserServiceClient;
import com.learning.enums.Status;
import com.learning.model.UserRequest;
import com.learning.model.UserResponse;


@RestController
@RequestMapping("/api/user/v1")
public class UserController {

	@Autowired
	private UserServiceClient userServiceClient;
	
	@PostMapping
	public UserResponse create(@RequestBody UserRequest userRequest) {
		return userServiceClient.createNewUser(userRequest);
	}

	@GetMapping("/{id}")
	public UserResponse get(@PathVariable Long id) {
		return userServiceClient.getExistingUserById(id);
	}
	
	@PutMapping("/{id}")
	public UserResponse update(@PathVariable Long id, @RequestBody UserRequest userRequest) {
		return userServiceClient.updateExistingUserById(id, userRequest);
	}
	
	@DeleteMapping("/{id}")
	public Status delete(@PathVariable Long id) {
		return userServiceClient.deleteExistingUserById(id);	
	}

}