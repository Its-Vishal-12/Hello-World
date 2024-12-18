package com.service.Student.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class StudentConfig {
	
	@Bean
	public RestTemplate getTemplate() {
		return new RestTemplate();
		
	}
	
	
	
	

}
