package com.ls.springcloudrouter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringcloudrouterApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudrouterApplication.class, args);
    }

}
