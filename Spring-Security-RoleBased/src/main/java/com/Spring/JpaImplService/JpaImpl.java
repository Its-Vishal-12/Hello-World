package com.Spring.JpaImplService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Spring.Entity.User;
import com.Spring.Exception.NotFound;
import com.Spring.Jpa.JpaRepo;
import com.Spring.Jpa.Operations;

@Service
public class JpaImpl  implements Operations {
      @Autowired
	  private JpaRepo  repo;
	
	
	@Override
	public void addUser(User user) {
		


		repo.save(user); 
		
		
	
	}

	@Override
	public User findByUserId(String userid) {
		   User  user=repo.findById(userid).get();
		   if(user==null) {
			   
			  throw new NotFound("User Not Available");
		   }
		   
		   
		   return user;
	}

	@Override
	public List<User> getAllUser() {
		List<User> list= repo.findAll();
		return list;
	}

	@Override
	public void deleteUser(String userid) {
		 User user=  repo.findById(userid).get();
		 
		 if(user==null) {
			 
			 throw new NotFound("User Not Found");
		 }
		 
		repo.delete(user);
	}

	@Override
	public User getByName(String username) {
		
		return repo.findByUsername(username);
	}
	
	

}
