package com.Spring.Fc.Eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class FeignClientEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignClientEurekaServerApplication.class, args);
	}

}
