package com.ConsumerApi.ViewController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewControllers {
	
	
	@GetMapping("/register")
	public String register() {
		
		return "Register";
	}
	
	@GetMapping("/detail")
	public String getDetail() {
	return "ViewDetail";
	}
	
	
	@GetMapping("/create")
	public String generateCredencial() {
	return "Login";
	}
	
//	@GetMapping({"/show","/showall"})
//	public String showList() {
//	return "List";
//	}
	
	
	
	

}
