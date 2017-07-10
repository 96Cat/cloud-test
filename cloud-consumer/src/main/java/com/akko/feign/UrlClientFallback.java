package com.akko.feign;

import org.springframework.stereotype.Component;

@Component
public class UrlClientFallback implements UrlClient {

	@Override
	public String findByName(String serviceName) {
		System.err.println("UrlClientFallback.findByName()");
		return null;
	}

}
