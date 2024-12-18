package com.Spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class TestingApplication {

	
	@PostConstruct
	public void myMethod() {
		
	 // A a=new A("Vishal");	
		
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(TestingApplication.class, args);
	}

}
