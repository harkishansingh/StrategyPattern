package com.harki.pattern;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.harki.pattern.service.ValidationStrategy;
import com.harki.pattern.service.Validator;

@Configuration
@ComponentScan(basePackages = "com.harki.pattern")
public class AppConfig {
	@Bean
	public Validator getValidator(@Qualifier("IsAllLowerCase") ValidationStrategy strategy) {
		return new Validator(strategy);
	}

}