package com.Spring.Fc.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/App1")
public class AppController {
	
	List<String> list=new ArrayList<>();
	 
	
	
	@GetMapping("/getname")
	public  ResponseEntity<String> getName(){
		
		return new ResponseEntity<>("Get Name Method:",HttpStatus.OK);
	}
	
	
	@GetMapping("/getstatus")
	public  ResponseEntity<String> getStatus(){
		
		return new ResponseEntity<>("Everthing Is Fine:",HttpStatus.OK);
	}
	
	@GetMapping("/getStudent")
	public ResponseEntity<List<String>> getStudent(){
		
		list.add("Vishal");
		list.add("Manish");
		list.add("Kumar");
		list.add("Mayank");
		
		return new ResponseEntity<>(list, HttpStatus.OK);
		
	}
	
	
	

}
