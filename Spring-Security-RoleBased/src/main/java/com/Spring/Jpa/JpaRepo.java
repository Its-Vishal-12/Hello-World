package com.Spring.Jpa;

 

import org.springframework.data.jpa.repository.JpaRepository;

import com.Spring.Entity.User;

public interface JpaRepo  extends JpaRepository<User,String> {
	
	
	public User findByUsername(String username);
	
	

}
