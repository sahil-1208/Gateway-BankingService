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

import com.learning.client.AccountServiceClient;
import com.learning.enums.Status;
import com.learning.model.AccountRequest;
import com.learning.model.AccountResponse;

@RestController
@RequestMapping("/api/account/v1")
public class AccountController {

	@Autowired
	private AccountServiceClient userServiceClient;
	
	@PostMapping
	public AccountResponse create(@RequestBody AccountRequest accountRequest) {
		return userServiceClient.createNewAccount(accountRequest);
	}

	@GetMapping("/{id}")
	public AccountResponse get(@PathVariable Long id) {
		return userServiceClient.getExistingAccountById(id);
	}
	
	@PutMapping("/{id}")
	public AccountResponse update(@PathVariable Long id, @RequestBody AccountRequest accountRequest) {
		return userServiceClient.updateExistingAccountById(id, accountRequest);
	}
	
	@DeleteMapping("/{id}")
	public Status delete(@PathVariable Long id) {
		return userServiceClient.deleteExistingAccountById(id);	
	}

}

