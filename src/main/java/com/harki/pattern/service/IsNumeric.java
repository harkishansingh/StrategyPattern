package com.harki.pattern.service;

import org.springframework.stereotype.Component;

@Component
public class IsNumeric implements ValidationStrategy {

	public boolean execute(String str) {
		return str.matches("\\d+");
	}

}
