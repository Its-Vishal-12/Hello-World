package com.Spring;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class BeansConfiguration {
	
	 @Autowired
	 private A a;
	
	
	
	@PostConstruct
      public void  postConstruct()  throws Exception{
    	  
    	 System.out.println("Post Construct"); 
    	  
      }
		
	
	
	public String getString() {
		
		return a.getName();
	}
	
	
	
	
	@PreDestroy
	public void preDestroy() throws Exception {
		
		System.out.println("Post Construct"); 
		
	}
			
	
	

}
