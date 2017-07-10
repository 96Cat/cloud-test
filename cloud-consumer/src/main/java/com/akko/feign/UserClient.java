package com.akko.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.akko.config.UserClientConfig;
import com.akko.pojo.User;

@FeignClient(name = "provider", configuration = UserClientConfig.class, 
/*fallback = UserClientFallback.class,*/ fallbackFactory = UserClientFallbackFactory.class)
public interface UserClient {
	
	@RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public User findById(@PathVariable("id") int id);
	
	@RequestMapping(value = "/user", method = RequestMethod.POST)
    public User save(@RequestBody User user);

}
