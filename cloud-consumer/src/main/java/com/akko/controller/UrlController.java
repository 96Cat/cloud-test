package com.akko.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.akko.feign.UrlClient;

@RestController
@RequestMapping("url")
public class UrlController {

	@Autowired
	private UrlClient urlClient;
	
	@GetMapping("/{serviceName}")
	public String url(@PathVariable("serviceName") String serviceName) {
		return urlClient.findByName(serviceName);
	}
	
}
