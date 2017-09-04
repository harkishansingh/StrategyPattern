package com.harki.pattern;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.harki.pattern.service.Validator;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { AppConfig.class })
public class ValidatorTest {
	@Autowired
	private Validator validator;

	@Test
	public void validateTest() {
		Assert.assertTrue(validator.validate("aaaa"));
	}

	@Test
	public void validateJava8Test() {
		/*
		 * ValidationStrategy is a functional interface.
		 * Instead of declaring new classes to implement different strategies,
		 * you can pass lamda expression directly, which are more concise 
		 */
		Validator validator = new Validator((String s) -> s.matches("[a-z]+"));
		Assert.assertTrue(validator.validate("aaaa"));

		validator = new Validator((String s) -> s.matches("\\d+"));
		Assert.assertTrue(validator.validate("1233"));
	}

}
