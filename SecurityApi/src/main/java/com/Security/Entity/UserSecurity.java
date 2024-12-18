package com.Security.Entity;


import java.io.Serializable;



import jakarta.persistence.*;
import jakarta.persistence.Table;

@Entity
@Table(name="usersecurity")
public class UserSecurity  implements Serializable{

	
	 @Id
	 @Column(name="username")
	 private String username;
	 
	 @Column(name="password")
	 private String password;


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}

	

	public UserSecurity() {
		super();
		// TODO Auto-generated constructor stub
	}


	public UserSecurity(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}


	@Override
	public String toString() {
		return "UserSecurity [username=" + username + ", password=" + password + "]";
	}
	 
	 
	 
}
