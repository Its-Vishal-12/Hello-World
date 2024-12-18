package com.JUnitTesting.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.JUnitTesting.Entity.Student;
import com.JUnitTesting.Service.TestService;


@RestController
@RequestMapping("/test")
public class TestController {
	
	
	@Autowired
	private TestService  service;
	
	
	@PostMapping("/add")
	public Student addStudent(@RequestBody Student student){
		
		service.addStudent(student);
		
		return student;
		
	}
	
	
	@GetMapping("/getall")
	public List<Student> getStudent(){
		
		return service.getStudent();
		
	}
	
	@GetMapping("/get/{roll}")
	public List<Student>  getByRoll(@PathVariable("roll") int roll) {
		
		return service.getByRoll(roll);
	}
	
	@GetMapping("/delete/{roll}")
	public List<Student>  removeStudentByRoll(@PathVariable("roll") int roll){
		
     	return	service.removeStudentByRoll(roll);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
