package com.Git.Project.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.Git.Project.Entity.User;
import com.Git.Project.Jpa.UserJpa;
import com.Git.Project.Jpa.UserOperation;
import com.Git.Project.Util.UserUtil;

import jakarta.persistence.NoResultException;

@Service
public class UserServices   implements  UserOperation {
	
 @Autowired	
 private UserJpa  userjpa;

 @Autowired
 private UserUtil  util;
 
@Override
public User addUser(User user) {
	 String username=util.createUserName(user);
	
	 user.setUsername(username);
	 
	 User us=userjpa.save(user);
	return us;
}

@Override
public List<User> getAllUser() {
	 List<User> userlist=userjpa.findAll();
	return userlist;
}

@Override
public User getByUserName(String username) {
	        User user=   userjpa.findById(username).orElseThrow(()-> new NoResultException());
	return user;
}

@Override
public String deleteUser(String username, String password) {
	    User user=userjpa.findById(username).get();
	    String result=null;
	    if(user.getPassword().equals(password)) {
	    	
	    	userjpa.delete(user);
	    	result="User Deleted";
	    }else {
	    	
	    	result="Try Again";
	    }
	    
	    
	return result;
}

	
	
	
	
	
	
	
}
