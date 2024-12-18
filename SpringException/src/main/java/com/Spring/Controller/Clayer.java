package com.Spring.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;


import com.Spring.Service.Slayer;

@RestController
@RequestMapping("/test")
public class Clayer {
	
	@Autowired
	 private Slayer service;
	
	
	@GetMapping("/get")
	public ResponseEntity<Object>  getDetail() {
		
		return new ResponseEntity<>(service.notFound(),HttpStatus.NOT_FOUND);
		
	}
	

	
	

}
