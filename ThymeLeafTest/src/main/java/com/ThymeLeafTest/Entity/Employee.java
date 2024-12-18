package com.ThymeLeafTest.Entity;

import java.time.LocalDate;


public class Employee {
	
	
	
 private String	Id;
 private String firstName;
 
 private String lastName;
 
 private String date;
 
 private LocalDate currentdate;

public String getId() {
	return Id;
}

public void setId(String id) {
	Id = id;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getDate() {
	return date;
}

public void setDate(String date) {
	this.date = date;
}

public LocalDate getCurrentdate() {
	return currentdate;
}

public void setCurrentdate(LocalDate currentdate) {
	this.currentdate = currentdate;
}

public Employee(String id, String firstName, String lastName, String date, LocalDate currentdate) {
	super();
	Id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.date = date;
	this.currentdate = currentdate;
}

@Override
public String toString() {
	return "Employee [Id=" + Id + ", firstName=" + firstName + ", lastName=" + lastName + ", date=" + date
			+ ", currentdate=" + currentdate + "]";
}

public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
 
 
 
 
 
}
