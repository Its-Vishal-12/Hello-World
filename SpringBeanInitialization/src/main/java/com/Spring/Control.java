package com.Spring;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Control {
	
	@Autowired
	A a;
	
	@GetMapping("/geta")
	public A getA() {
		
		return a;
	}
	

}
