package com.Security.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/secure")
public class SecurityContoller {
	
	@GetMapping("/add")
	public String Method1() {
		
		return "Entity added";
		}
	
	
	@GetMapping("/update")
	public String Method2() {
		return "Entity Updated";
		}
	
	@GetMapping("/delete")
	public String Method3() {
		return "Entity Deleted Successfully:";
		}

	
	
	

}
