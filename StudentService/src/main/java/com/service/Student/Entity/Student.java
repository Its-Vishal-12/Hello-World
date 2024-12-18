package com.service.Student.Entity;

import java.util.ArrayList;
import java.util.List;



import jakarta.persistence.*;

@Entity
@Table(name="Student")
public class Student {
	
	@Id
	private  String sid;
	
	
	private String name;
	
	private String email;
	
	@Transient
	private List<Address> addres=new ArrayList<>();

	public String getSid() {
		return sid;
	}
     
	public void setSid(String sid) {
		this.sid = sid;
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
	
   
	public List<Address> getAddres() {
		return addres;
	}

	public void setAddres(List<Address> addres) {
		this.addres = addres;
	}

	public Student(String sid, String name, String email) {
		super();
		this.sid = sid;
		this.name = name;
		this.email = email;
	}
	
	public Student(String name, String email) {
		super();
		
		this.name = name;
		this.email = email;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", email=" + email + "]";
	}
	
	
	
	
	

}
