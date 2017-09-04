package com.harki.pattern.service;

import org.springframework.beans.factory.annotation.Autowired;

public class Validator {
	private ValidationStrategy strategy;

	@Autowired
	public Validator(ValidationStrategy strategy) {
		super();
		this.strategy = strategy;
	}

	public boolean validate(String str) {
		return strategy.execute(str);
	}

}
