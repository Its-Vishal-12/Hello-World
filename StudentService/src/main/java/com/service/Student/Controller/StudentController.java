package com.service.Student.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.Student.Entity.Student;
import com.service.Student.Repo.Impl.StudentRepoImpl;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentRepoImpl  impl;
	
	@PostMapping("/add")
	public  ResponseEntity<Student> addStudent(@RequestBody Student stu){
		
		
		return new ResponseEntity<Student>(impl.addStudent(stu),HttpStatus.CREATED);
		
	}
	
	@GetMapping("/getall")
	public ResponseEntity<List<Student>> getAllStudent(){
		
		return  new ResponseEntity<List<Student>>(impl.getAllStudent(),HttpStatus.OK);
	}
	
	@GetMapping("/get/{sid}")
	public ResponseEntity<Student> getBySid(@PathVariable("sid") String sid){
		return new ResponseEntity<Student>(impl.getBySid(sid),HttpStatus.OK);
		}
	
	
	
	
	
	

}
