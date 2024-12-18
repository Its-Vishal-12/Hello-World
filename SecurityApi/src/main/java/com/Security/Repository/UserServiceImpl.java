package com.Security.Repository;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;

import com.Security.Entity.UserSecurity;

@Repository
public class UserServiceImpl  implements  UserService {
	
	@Autowired
	private  UserServiceRepo  repo;

	@Override
	public UserSecurity getUserByName(String name) {
    UserSecurity  user=repo.findById(name).get();
		return user;
	} 

	

}
