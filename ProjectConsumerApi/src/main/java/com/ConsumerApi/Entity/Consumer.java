package com.ConsumerApi.Entity;



import java.io.Serializable;

import jakarta.persistence.*;

@Entity
@Table(name="ConsumerDetail") 
public class Consumer  implements Serializable {
	
	@Column(name="FirstName")
	private String  firstname;
	
	@Column(name="LastName")
	 private String lastname;
	 
	@Column(name="DateOfBirth")
	 private String dateofbirth;
	
	@Id
	@Column(name="Phone") 
	private String phone;
		
	 
	@Column(name="Email")
	 private String  email;
	 
	@Column(name="UserName")
	 private String username;
	 
	@Column(name="Password")
	 private String password;

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstnanme) {
		this.firstname = firstnanme;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getDateofbirth() {
		return dateofbirth;
	}

	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	
	
	

	public Consumer(String firstnanme, String lastname, String dateofbirth, String phone, String email, String username,
			String password) {
		super();
		this.firstname = firstnanme;
		this.lastname = lastname;
		this.dateofbirth = dateofbirth;
		this.phone = phone;
		this.email = email;
		this.username = username;
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	

	public Consumer(String firstnanme, String lastname, String dateofbirth, String phone, String email) {
		super();
		this.firstname = firstnanme;
		this.lastname = lastname;
		this.dateofbirth = dateofbirth;
		this.phone = phone;
		this.email = email;
	}

	public Consumer() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Consumer [firstnanme=" + firstname + ", lastname=" + lastname + ", dateofbirth=" + dateofbirth
				+ ", phone=" + phone + ", email=" + email + ", username=" + username + ", password=" + password + "]";
	}


	 
	
	
	 
	 
	 

}
