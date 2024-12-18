package com.Spring.QueryHinter.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Spring.QueryHinter.Entity.Student;
import com.Spring.QueryHinter.Services.QueryService;

@RestController
@RequestMapping("/query")
public class QueryController {
	
	@Autowired
	QueryService   queryservice;

	@PostMapping("/add")
	public  ResponseEntity<Student> AddStudent(@RequestBody Student student) {
		
		return new ResponseEntity<>(queryservice.save(student),  HttpStatus.CREATED);
		
	}
	
	@GetMapping("/get/{marks}")
      public  ResponseEntity<List<Student>> getStudent(@PathVariable("marks") String markks) {
		
		return new ResponseEntity<>(queryservice.find50Marks(markks),  HttpStatus.CREATED);
		
	}
	
	
	
	
}
