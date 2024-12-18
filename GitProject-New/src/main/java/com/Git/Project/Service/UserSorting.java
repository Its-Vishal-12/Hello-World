package com.Git.Project.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Git.Project.Entity.User;
import com.Git.Project.Jpa.UserJpa;


@Service
public class UserSorting {
	
	 @Autowired
	 private UserJpa  userjpa;
	 
	 
	 
	 public List<User> getStream(String stream){
		 
	   List<User> userlist=userjpa.findAll();
		 
	 List<User> str= userlist.stream().filter(x->x.getStream().equals(stream)).collect(Collectors.toList());
	
	 return str;
	
	 }
	
	
	
	

}
