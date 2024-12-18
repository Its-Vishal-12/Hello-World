package com.Spring.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="Entity")
public class Entities {

@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="ID")
int id;	

@Column(name="Name")
String name;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Entities(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}

public Entities( String name) {
	super();
	//this.id = id;
	this.name = name;
}
public Entities() {
	super();
	// TODO Auto-generated constructor stub
}




	
}
