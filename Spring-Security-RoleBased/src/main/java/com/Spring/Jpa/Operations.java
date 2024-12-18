package com.Spring.Jpa;

import java.util.List;

import com.Spring.Entity.User;

public interface Operations {
	
	public void addUser(User user);
	
	public User findByUserId(String userid);
	
	public List<User> getAllUser();
	
	public void deleteUser(String userid);
	
	public User getByName(String username);
	

}
