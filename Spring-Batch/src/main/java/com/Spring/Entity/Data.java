package com.Spring.Entity;


public class Data {

	public String batch_id;
	
	public String name;
	public String email;
	public String phone;
	public String getBatch_id() {
		return batch_id;
	}
	public void setBatch_id(String batch_id) {
		this.batch_id = batch_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Data(String batch_id, String name, String email, String phone) {
		super();
		this.batch_id = batch_id;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}
	public Data() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Data [batch_id=" + batch_id + ", name=" + name + ", email=" + email + ", phone=" + phone + "]";
	}
	
	
	
	
	
	
}
