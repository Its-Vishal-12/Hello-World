package com.Security.Configuration;


//import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.Security.Repository.UserServiceRepo;
import com.Security.Service.SecurityService;

@Configuration


public class SecurityConfig {
	
//	@Autowired(required=true)
//	private DataSource  datasource;
	
	@Autowired
	private SecurityService service;
	

	
	@Autowired
	public void configureUser(AuthenticationManagerBuilder  manager) throws Exception {
		 manager.userDetailsService(service).passwordEncoder(NoOpPasswordEncoder.getInstance());
		
		
	}
	
	
	//to give access only defined url,On  rest  
	// url  security will be applied [Credencial must be needed]
	
	@Bean
	public SecurityFilterChain  m1(HttpSecurity  http) throws Exception {
		
		http.authorizeHttpRequests((request)-> request.requestMatchers("/secure/update").permitAll().anyRequest().authenticated()).formLogin();
		
		
		
		return  http.build();
	}
	
	
	//to get data from database like user-name and password and internally it get compared 
	//by Authentication Manager we don't have  to configure at Application.Properties 
	// we can also give authentication to access another url as well like Admin can access all url 
	//and user can access only few url 
	
//	@Autowired
//	public void authManager(AuthenticationManagerBuilder    manager) throws Exception {
//		
//		manager.jdbcAuthentication()
//		.dataSource(datasource)
//        .usersByUsernameQuery("Select username , password from usersecurity where username =?");	
//        
//		
//	}
	
	
	
	
	
	

}
