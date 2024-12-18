package com.Spring.JpaImplService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.Spring.Entity.User;


@Configuration
public class UserDetailServiceImpl  implements UserDetailsService{

 @Autowired	
 private JpaImpl  impl;
	
	
	@Override

	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		   User  user=impl.getByName(username);
		    
		   
		  
		  return null;
}

}
