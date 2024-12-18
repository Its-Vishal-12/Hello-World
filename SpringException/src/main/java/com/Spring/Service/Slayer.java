package com.Spring.Service;

import org.springframework.stereotype.Service;

import com.Spring.ExceptionFound.NotFound;

@Service
public class Slayer {
	
	
	public Object  notFound() {
		
		String st="Vishal";
		
		throw new NotFound("DATA NOT FOUND");
	}
	
	

}
