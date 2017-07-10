package com.akko.controller;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.akko.pojo.User;

@RestController
@RequestMapping("user")
public class UserController {
	
	static List<User> users = null;
	
	static {
		users = Stream.generate(() -> new User("yozuca")).limit(10).collect(Collectors.toList());
	}

	@GetMapping("/{id}")
	public User user(@PathVariable("id") int id) {
		return users.get(id);
	}
	
	@PostMapping
	public User user(@RequestBody User user) {
		return user;
	}
	
	
}
