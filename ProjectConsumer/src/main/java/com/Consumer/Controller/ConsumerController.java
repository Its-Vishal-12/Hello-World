package com.Consumer.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller

public class ConsumerController {
	
	@GetMapping(value="/login")
	public  String getLogin() {
		
	return "login";	
		
	}
	
	
	
	

}
