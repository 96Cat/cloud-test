package com.akko.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.akko.config.UrlClientConfig;

@FeignClient(name = "unique", url = "http://localhost:8761/eureka", configuration = UrlClientConfig.class)
public interface UrlClient {
	
	@RequestMapping(value = "/apps/{serviceName}", method = RequestMethod.GET)
    public String findByName(@PathVariable("serviceName") String serviceName);

}
