package com.Security.Service;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import org.springframework.stereotype.Service;

import com.Security.Entity.UserSecurity;
import com.Security.Repository.UserServiceImpl;


@Service

public class SecurityService implements UserDetailsService {
    
	@Autowired
	private UserServiceImpl  impl;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	
		//logic for username  by data Jpa;
	   
		
		UserSecurity  user=impl.getUserByName(username);
   
		   
		return  new User(user.getUsername(),user.getPassword(),Collections.emptyList());

	}
	
}
