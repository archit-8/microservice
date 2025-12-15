package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
@RequestMapping("/read")//to refresh the beans 
//when http://localhost:9999/actuator.refresh
//is made from post or curl
//to update the properties with latest changes
public class UseConfigController {

	 @Value("${server.port.key}")
	 String serverPort;
	 
	 @Value("${spring.application.name}")
	 String appName;
	 
	 @Value("${message}")
	 String message;
	 
	 @GetMapping("/status")
	 public  String showprops() {

		    return "serverPort=" + serverPort + ", appName=" + appName + ", message=" + message;
	 
	
	 }
}
