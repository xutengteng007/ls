package com.ls.a1service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class A1serviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(A1serviceApplication.class, args);
    }

}
