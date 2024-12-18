package com.Git.Project.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.Git.Project.Entity.User;
import com.Git.Project.Jpa.UserJpa;

@Service
public class UserDetail  implements UserDetailsService {

	 @Autowired	
	 private UserJpa  userjpa;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	
List<User> userlist=userjpa.findAll();
		
     List <User> user =userlist.stream().filter(x->x.getFullname().equalsIgnoreCase(username)).collect(Collectors.toList());
      
     User us=user.iterator().next();
     
        return   new User(us.getUsername(),us.getPassword(),Collections.emptyList());
	}

}
