package com.harki.pattern.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Qualifier(value = "IsAllLowerCase")
@Component
public class IsAllLowerCase implements ValidationStrategy {

	public boolean execute(String str) {
		return str.matches("[a-z]+");
	}

}
