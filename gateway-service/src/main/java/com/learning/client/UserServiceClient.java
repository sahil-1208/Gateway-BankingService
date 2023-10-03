package com.learning.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.learning.enums.Status;
import com.learning.model.UserRequest;
import com.learning.model.UserResponse;

@FeignClient(value = "UserServiceClient", url = "http://localhost:8080/user")
public interface UserServiceClient {

	@PostMapping
	public UserResponse createNewUser(@RequestBody UserRequest userRequest);

	@GetMapping("/{id}")
	public UserResponse getExistingUserById(@PathVariable Long id);
	
	@PutMapping("/{id}")
	public UserResponse updateExistingUserById(@PathVariable Long id, @RequestBody UserRequest userRequest);
	
	@DeleteMapping("/{id}")
	public Status deleteExistingUserById(@PathVariable Long id);
}
