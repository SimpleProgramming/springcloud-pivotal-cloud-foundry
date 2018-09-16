package com.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class SimpleController {
	
	@Value("${configuration.property.value:default}")
	private String configurationValue;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping
	@HystrixCommand(fallbackMethod="backUpMethod")
	public String sayHello() {
		return restTemplate.getForObject("http://uri.not.available.io", String.class);
	}
	
	public String backUpMethod() {
		return configurationValue;
	}
}
