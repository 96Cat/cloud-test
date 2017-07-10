package com.akko.config;

import org.springframework.context.annotation.Bean;

import feign.Logger;

//@Configuration
public class UserClientConfig {

	@Bean
	Logger.Level feignLoggerLevel() {
		return Logger.Level.FULL;
	}

}
