package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service")
public class HelloController {
	
	@Value("${spring.application.name}")
	String name;
	
	@Autowired
	Environment env;
	
	@GetMapping("/prop")
	public String Welcome() {
		String port= env.getProperty("server.port");
		return "programiing microservcies"+port+"application name"+name;
	}
	@GetMapping("/status")
	public String status() {
		return "up and running";
	}
	

}
