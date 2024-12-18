package com.Spring.Fc.Service.AppService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@Service
public class AppService {
	
	
	@Autowired
	AppClient  appclient;
	
	
	@CircuitBreaker(name="Feign-Client", fallbackMethod="fallbackMethod")
	public ResponseEntity<String> getBreaker() {
		
		System.out.println("Get Breaker Method  inside service class Exceuted:");
		
		return appclient.getUpdate();
		
		
	}
	
	
	//fall back method when feign client not working
	public ResponseEntity<String> fallbackMethod(){
		
		System.out.println("Fall Back Method  inside service Exceuted:");
		
		return new ResponseEntity<>("Fall Back Method Executed Pls Wait:", HttpStatus.NOT_FOUND);
		
	}
    
	
	
	
			
			
	
}
