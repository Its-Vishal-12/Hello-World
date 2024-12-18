package com.Git.Project.Entity;



public class UserDto {
	
	
	private String fullname;

	private String email;
	
	private String dob;
	private String stream;
	private String username;

	private String password;

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
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

	

	public UserDto(String fullname, String email, String dob, String stream, String username, String password) {
		super();
		this.fullname = fullname;
		this.email = email;
		this.dob = dob;
		this.stream = stream;
		this.username = username;
		this.password = password;
	}

	public UserDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "UserDto [fullname=" + fullname + ", email=" + email + ", dob=" + dob + ", stream=" + stream
				+ ", username=" + username + ", password=" + password + "]";
	}

	

}
