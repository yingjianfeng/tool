package com.yjf.nacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NacosApplication {
//aa
    public static void main(String[] args) {
        SpringApplication.run(NacosApplication.class, args);
    }
}
