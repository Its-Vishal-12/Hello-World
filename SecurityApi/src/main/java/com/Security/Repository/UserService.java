package com.Security.Repository;

//import org.springframework.security.core.userdetails.UserDetails;


import com.Security.Entity.UserSecurity;



public interface UserService {
	
	
	public UserSecurity  getUserByName(String name);
	
	

}
