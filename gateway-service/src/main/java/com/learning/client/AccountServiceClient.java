package com.learning.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.learning.enums.Status;
import com.learning.model.AccountRequest;
import com.learning.model.AccountResponse;

@FeignClient(value = "AccountServiceClient", url = "http://localhost:8081/account")
public interface AccountServiceClient {

	@PostMapping
	public AccountResponse createNewAccount(@RequestBody AccountRequest accountRequest);

	@GetMapping("/{id}")
	public AccountResponse getExistingAccountById(@PathVariable Long id);
	
	@PutMapping("/{id}")
	public AccountResponse updateExistingAccountById(@PathVariable Long id, @RequestBody AccountRequest accountRequest);
	
	@DeleteMapping("/{id}")
	public Status deleteExistingAccountById(@PathVariable Long id) ;
}
