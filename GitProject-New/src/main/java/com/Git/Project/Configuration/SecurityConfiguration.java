package com.Git.Project.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfiguration {
	
	
	@Bean
	 SecurityFilterChain   getAccess(HttpSecurity   http) throws Exception {
		
	
		
//	http.authorizeHttpRequests(req->req.requestMatchers("/user/add","/user/getall")
//			.permitAll()
//			.anyRequest()
//			.authenticated()
//			).formLogin();	
		
		
		http.authorizeHttpRequests().anyRequest().permitAll();
		return http.build();
		
	}
	
	
	@Bean
	 SecurityFilterChain   getSecure(HttpSecurity   http) throws Exception {
		
	
		

		return http.build();
	}
	
	
	
	

}
