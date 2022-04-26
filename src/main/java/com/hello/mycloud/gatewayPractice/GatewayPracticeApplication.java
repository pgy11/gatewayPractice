package com.hello.mycloud.gatewayPractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
public class GatewayPracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayPracticeApplication.class, args);
	}

}
