package com.Spring;

public class A {

	 private String name="Vishal";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public A(String name) {
		super();
		this.name = name;
	}
	
	public A() {
		
		
	}

	@Override
	public String toString() {
		return "A [name=" + name + "]";
	}
	
	
	
	
}
