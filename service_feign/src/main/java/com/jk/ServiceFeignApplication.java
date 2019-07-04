package com.jk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients//用于开启feign的客户端，
public class ServiceFeignApplication {
	public static void main(String[] args) {
		SpringApplication.run(ServiceFeignApplication.class, args);
	}

}
