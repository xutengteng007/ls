package com.ls.jwt_uua;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class JwtUuaApplication {

    public static void main(String[] args) {
        SpringApplication.run(JwtUuaApplication.class, args);
    }

}
