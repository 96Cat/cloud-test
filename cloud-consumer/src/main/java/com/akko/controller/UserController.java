package com.akko.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.akko.feign.UserClient;
import com.akko.pojo.User;

@RestController
@RequestMapping("user")
public class UserController {
	
	@Autowired
	private UserClient cserClient;

	@GetMapping("/{id}")
	public User user(@PathVariable("id") int id) {
		return cserClient.findById(id);
	}
	
	@PostMapping
	public User user(@RequestBody User user) {
		return cserClient.save(user);
	}
	
}

