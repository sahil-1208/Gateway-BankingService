package com.learning.model;

import java.time.LocalDate;

public class Suggestions {
	
	    public Integer amount;
	    public Integer term;
	    public Integer monthlyPayment;
	    public Double interestRate;
	    public Integer aprRate;
	    public LocalDate dueDate;
	    
		public Integer getAmount() {
			return amount;
		}
		public void setAmount(Integer amount) {
			this.amount = amount;
		}
		public Integer getTerm() {
			return term;
		}
		public void setTerm(Integer term) {
			this.term = term;
		}
		public Integer getMonthlyPayment() {
			return monthlyPayment;
		}
		public void setMonthlyPayment(Integer monthlyPayment) {
			this.monthlyPayment = monthlyPayment;
		}
		public Double getInterestRate() {
			return interestRate;
		}
		public void setInterestRate(Double interestRate) {
			this.interestRate = interestRate;
		}
		public Integer getAprRate() {
			return aprRate;
		}
		public void setAprRate(Integer aprRate) {
			this.aprRate = aprRate;
		}
		public LocalDate getDueDate() {
			return dueDate;
		}
		public void setDueDate(LocalDate dueDate) {
			this.dueDate = dueDate;
		}
	    
	}

