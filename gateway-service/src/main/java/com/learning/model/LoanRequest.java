package com.learning.model;

import java.util.List;

public class LoanRequest {
	public Integer id;
	public String uid;
	public Integer amount;
	public Integer term;
	public List<Suggestions> suggestions;

	public Integer getId() {
		return id;
	}	

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

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

	public List<Suggestions> getSuggestions() {
		return suggestions;
	}

	public void setSuggestions(List<Suggestions> suggestions) {
		this.suggestions = suggestions;
	}
}
