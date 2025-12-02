package com.example.ureka.Server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class UrekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(UrekaServerApplication.class, args);
    }
}