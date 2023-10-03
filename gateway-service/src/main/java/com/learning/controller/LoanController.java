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

import com.learning.client.LoanServiceClient;
import com.learning.enums.Status;
import com.learning.model.LoanRequest;
import com.learning.model.LoanResponse;


@RestController
@RequestMapping("/api/loan/v1")
public class LoanController {
	
		@Autowired
		private LoanServiceClient loanServiceClient;
		
		@PostMapping
		public LoanResponse create(@RequestBody LoanRequest loanRequest) {
			return loanServiceClient.createNewLoan(loanRequest);
		}

		@GetMapping("/{id}")
		public LoanResponse get(@PathVariable Integer id) {
			return loanServiceClient.getExistingLoanById(id);
		}
		
		@PutMapping("/{id}")
		public LoanResponse update(@PathVariable Integer id, @RequestBody LoanRequest loanRequest) {
			return loanServiceClient.updateExistingLoanById(id, loanRequest);
		}
		
		@DeleteMapping("/{id}")
		public Status delete(@PathVariable Integer id) {
			return loanServiceClient.deleteExistingLoanById(id);
		}

	}

