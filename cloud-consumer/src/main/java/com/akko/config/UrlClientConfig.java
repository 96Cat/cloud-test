package com.akko.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import feign.Feign;
import feign.auth.BasicAuthRequestInterceptor;

//@Configuration
public class UrlClientConfig {

	/*@Bean
	public Contract feignContract() {
		return new feign.Contract.Default();
	}*/

	@Bean
	public BasicAuthRequestInterceptor basicAuthRequestInterceptor() {
		return new BasicAuthRequestInterceptor("admin", "admin");
	}
	
	@Bean
	@Scope("prototype")
	public Feign.Builder feignBuilder() {
		return Feign.builder();
	}

}
