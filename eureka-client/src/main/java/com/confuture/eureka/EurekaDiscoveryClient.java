package com.confuture.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EurekaDiscoveryClient {
    public static void main(String[] args) {
        SpringApplication.run(EurekaDiscoveryClient.class, args);
    }
}
