package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;

@EnableDiscoveryClient
@SpringBootApplication
public class GatewayRles2Application {

	public static void main(String[] args) {
		SpringApplication.run(GatewayRles2Application.class, args);
	}

}
