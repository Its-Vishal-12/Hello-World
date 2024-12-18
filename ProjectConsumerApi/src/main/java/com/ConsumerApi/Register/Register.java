package com.ConsumerApi.Register;



public class Register {

	
	private String  firstnanme;
	

	 private String lastname;
	 
	
	 private String dateofbirth;
	 
	 private String phone;
	
	 public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	private String  email;


	public String getFirstnanme() {
		return firstnanme;
	}


	public void setFirstnanme(String firstnanme) {
		this.firstnanme = firstnanme;
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


	@Override
	public String toString() {
		return "Register [firstnanme=" + firstnanme + ", lastname=" + lastname + ", dateofbirth=" + dateofbirth
				+ ", phone=" + phone + ", email=" + email + "]";
	}
	 
	 
	 
}


