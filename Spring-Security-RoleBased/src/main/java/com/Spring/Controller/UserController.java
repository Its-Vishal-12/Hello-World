package com.Spring.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Spring.Entity.User;
import com.Spring.JpaImplService.JpaImpl;

@RestController
@RequestMapping("/user")
public class UserController {
	
	   @Autowired
	  private JpaImpl  service;
	
	   
	   @PostMapping("/add-user")
	  public ResponseEntity<String> addUser(@RequestBody User user) {
		   service.addUser(user);
		   
		return  new ResponseEntity<>("User Added",HttpStatus.CREATED);
		  
	  }
	   
	   
	   @GetMapping("/get/{userid}")
	   public ResponseEntity<User> findByUserId(@PathVariable("userid") String userid) {
		   
		return  new ResponseEntity<>(service.findByUserId(userid),HttpStatus.ACCEPTED);
		  
	  }
	   
	   
	   @GetMapping("/")
	   public ResponseEntity<String> get() {
		   
		return  new ResponseEntity<>("WELCOME TO VISHAL APPLICATION:",HttpStatus.OK);
		  
	  }
	
	   @GetMapping("/getall")
	   public ResponseEntity<List<User>>  getAllUser() {
		   
		return  new ResponseEntity<>(service.getAllUser(),HttpStatus.OK);
		  
	  }
	
	   @DeleteMapping("/delete/{userid}")
	   public ResponseEntity<String> deleteUser(@PathVariable("userid")String userid){
		   service.deleteUser(userid);
		   
		return  new ResponseEntity<>("User Removed ",HttpStatus.OK);
		  
	  }
	   
	

}
