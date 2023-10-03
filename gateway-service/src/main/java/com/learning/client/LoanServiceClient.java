package com.learning.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.learning.enums.Status;
import com.learning.model.LoanRequest;
import com.learning.model.LoanResponse;


@FeignClient(value = "LoanServiceClient", url = "http://localhost:8082/loan")
public interface LoanServiceClient {

	@PostMapping
	public LoanResponse createNewLoan(@RequestBody LoanRequest loanRequest);

	@GetMapping("/{id}")
	public LoanResponse getExistingLoanById(@PathVariable Integer id);

	@PutMapping("/{id}")
	public LoanResponse updateExistingLoanById(@PathVariable Integer id, @RequestBody LoanRequest loanRequest);

	@DeleteMapping("/{id}")
	public Status deleteExistingLoanById(@PathVariable Integer id);

}