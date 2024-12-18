package com.Git.Project.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Git.Project.Entity.User;
import com.Git.Project.Service.UserServices;
import com.Git.Project.Service.UserSorting;

import jakarta.servlet.http.HttpSession;
import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/user")

public class UserController {

	@Autowired
    private  UserServices  userservice;
	
         @Autowired
        private  UserSorting usersorting;
	
	@PostMapping("/add")
	public ResponseEntity<String> addUser(@RequestBody User User){
		
		return new ResponseEntity<>(userservice.addUser(User).toString()+"Data Inserted:" , HttpStatus.CREATED);
		}
	
    @GetMapping("/getall")
	public ResponseEntity<String> getAllUser(){
		
		return new ResponseEntity<>(userservice.getAllUser().toString()+"Every Thing is Getted:",HttpStatus.OK);
		
	}
	
    
    @GetMapping("/getby")
    public ResponseEntity<User> getByUserName(@RequestParam("username") String username){
    	
    	return new ResponseEntity<>(userservice.getByUserName(username),HttpStatus.FOUND);
    	
    }
    
    
    @DeleteMapping("/delete")
    public ResponseEntity<String> deleteUser(@RequestParam ("username") String username ,@RequestParam ("password") String password){
    	
    	return  new ResponseEntity<>(userservice.deleteUser(username, password)+"User Deleted:",HttpStatus.OK);
    	
    }
    
    @GetMapping("/getbystream")
    public ResponseEntity<String> getStream(@RequestParam("stream") String stream){
    	
    	return new ResponseEntity<>(usersorting.getStream(stream).toString()+"Stream Got:",HttpStatus.OK);
    }
    
    
    @GetMapping("/timeout")
    public String timeout(HttpSession session) {
    	
       session.setMaxInactiveInterval(1000);
       session.invalidate();
    	
    	return "Timeout after 1 min";
    }
    

}
