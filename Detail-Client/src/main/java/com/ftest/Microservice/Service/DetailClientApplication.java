package com.ftest.Microservice.Service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient

public class DetailClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(DetailClientApplication.class, args);
	}

}
