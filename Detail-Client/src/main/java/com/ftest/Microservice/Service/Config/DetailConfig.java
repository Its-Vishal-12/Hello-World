package com.ftest.Microservice.Service.Config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DetailConfig {
	
	@Bean
   public 	ModelMapper  model() {
		
		return new ModelMapper();
		
	}

}
