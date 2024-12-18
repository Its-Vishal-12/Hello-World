package com.Spring.Fc.Service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class FeignClientService1Application {

	public static void main(String[] args) {
		SpringApplication.run(FeignClientService1Application.class, args);
	}

}
