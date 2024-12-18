package com.Git.Project.Jpa;

import java.util.List;

import com.Git.Project.Entity.User;

public interface UserOperation {
	
	
	public  User  addUser(User user);
	
	public List<User> getAllUser();
	
	public  User  getByUserName(String username);
	
	
	public String deleteUser(String username , String password);
	
	
	
	
	

}
