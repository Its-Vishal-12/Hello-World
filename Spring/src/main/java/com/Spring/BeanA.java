package com.Spring;

public class BeanA {
	
	private int roll=10;
	private String name="Vishal";
	
	
	
	
	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	BeanA(){
		System.out.println("Default Constructor BeanA"); 
	}

	BeanA(int roll, String name){
		
		System.out.println("Parameter Constructor  BeanA"); 
		
		this.roll=roll;
		this.name=name;
		
	}

	@Override
	public String toString() {
		return "BeanA [roll=" + roll + ", name=" + name + "]";
	}
	
	
	
}
