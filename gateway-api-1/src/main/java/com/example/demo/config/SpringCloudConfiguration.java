package com.example.demo.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringCloudConfiguration {

    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()  
                .route("first-rest", r -> r.path("/loan/api/v1.0/**")  
                        .filters(f -> f.addResponseHeader("X-Response-header", "World"))  
                        .uri("http://localhost:9999"))            
                .build();  
    }
}
