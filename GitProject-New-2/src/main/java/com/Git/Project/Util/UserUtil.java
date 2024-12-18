package com.Git.Project.Util;


import java.util.Random;

import org.springframework.stereotype.Component;


import com.Git.Project.Entity.User;

@Component
public class UserUtil {
	
	
	public String createUserName(User user) {
		Random r= new Random();
     	int randomnumber=r.nextInt(0, 99999);
	   String number=Integer.toString(randomnumber);
		
	   String username=user.getFullname().toLowerCase().substring(0,4)+number;
		
		return username;
		
	}
	
	
	

}
