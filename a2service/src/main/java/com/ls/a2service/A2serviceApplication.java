package com.ls.a2service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class A2serviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(A2serviceApplication.class, args);
    }

}
