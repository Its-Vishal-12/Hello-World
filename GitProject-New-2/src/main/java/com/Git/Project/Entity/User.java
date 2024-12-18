package com.Git.Project.Entity;



import java.io.Serializable;

import jakarta.persistence.*;

@Entity
@Table(name="UserDetail")
public class User implements Serializable{

	@Column(name="Full Name")
	private String fullname;
	@Column(name="Email")
	private String email;
	@Column(name="DateOfBirth")
	private String dob;
	@Column(name="Stream")
	private String stream;
	@Id
	@Column(name="Username")
	private String username;
	@Column(name="Password")
	private String password;
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
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
	public User(String fullname, String email, String dob, String stream, String username, String password) {
		super();
		this.fullname = fullname;
		this.email = email;
		this.dob = dob;
		this.stream = stream;
		this.username = username;
		this.password = password;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [fullname=" + fullname + ", email=" + email + ", dob=" + dob + ", stream=" + stream + ", username="
				+ username + ", password=" + password + "]";
	}


	
	
	
	
	
	
}
