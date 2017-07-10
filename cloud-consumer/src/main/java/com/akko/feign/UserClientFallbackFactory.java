package com.akko.feign;

import org.springframework.stereotype.Component;

import com.akko.pojo.User;

import feign.hystrix.FallbackFactory;

@Component
public class UserClientFallbackFactory implements FallbackFactory<UserClient> {

	@Override
	public UserClient create(Throwable throwable) {
		
		throwable.printStackTrace();
		
		return new UserClient(){
			
			@Override
			public User findById(int id) {
				System.err.println("UserClientFallbackFactory.create(...).new UserClient() {...}.findById()");
				return null;
			}

			@Override
			public User save(User user) {
				System.err.println("UserClientFallbackFactory.create(...).new UserClient() {...}.save()");
				return null;
			}
			
		};
	}

}
