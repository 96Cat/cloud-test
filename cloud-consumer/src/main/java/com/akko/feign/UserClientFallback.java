package com.akko.feign;

import org.springframework.stereotype.Component;

import com.akko.pojo.User;

@Component
public class UserClientFallback implements UserClient {

	@Override
	public User findById(int id) {
		System.err.println("HystrixClientFallback.findById()");
		return null;
	}

	@Override
	public User save(User user) {
		System.err.println("HystrixClientFallback.save()");
		return null;
	}

}
