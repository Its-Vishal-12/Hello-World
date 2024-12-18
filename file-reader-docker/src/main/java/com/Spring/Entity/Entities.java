package com.Spring.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="entity")
public class Entities {

	
  @Id
  @Column(name="id")
  int id;
  @Column(name="name")
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
public Entities() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Entities [id=" + id + ", name=" + name + "]";
}
  
  
  
  

	
}
