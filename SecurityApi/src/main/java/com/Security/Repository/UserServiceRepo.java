package com.Security.Repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.Security.Entity.UserSecurity;


public interface UserServiceRepo extends JpaRepository<UserSecurity , String> {
	
	

}
