package com.Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class SpringBeanInitializationApplication {
   @Autowired
	BeansConfiguration bean;

	public static void main(String[] args) {
		ApplicationContext ac=	SpringApplication.run(SpringBeanInitializationApplication.class, args);
		
		//ApplicationContext ac=new AnnotationConfigApplicationContext(SpringBeanInitializationApplication.class);
		
		
		
	}

}
