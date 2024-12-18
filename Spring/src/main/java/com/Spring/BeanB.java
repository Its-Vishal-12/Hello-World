package com.Spring;

public class BeanB {
	
 private BeanA  a;
	
 private String address;
 
 
 
 public BeanA getA() {
	return a;
}


public void setA(BeanA a) {
	this.a = a;
}


public String getAddress() {
	return address;
}


public void setAddress(String address) {
	this.address = address;
}


BeanB(){
	 
	 System.out.println("Default Constructor BeanB");
 }
 
 
 BeanB(BeanA a,String address){
	 System.out.println("Parametric Consytuctor BeanB");
	 this.address=address;
	 this.a=a;
	 }


@Override
public String toString() {
	return "BeanB [a=" + a + ", address=" + address + "]";
}
	
 

}
