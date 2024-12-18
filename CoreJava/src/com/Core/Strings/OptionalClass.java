package com.Core.Strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.naming.NameNotFoundException;

class Student{
	
	int roll;
	
	String name;
	
	String gmail;

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

	public String getGmail() {
		return gmail;
	}

	public void setGmail(String gmail) {
		this.gmail = gmail;
	}

	public Student(int roll, String name, String gmail) {
		super();
		this.roll = roll;
		this.name = name;
		this.gmail = gmail;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", gmail=" + gmail + "]";
	}
	
}
public class OptionalClass {
     static 	List<Student> list=new ArrayList<>();
     
     
     static{
    		list.add(new Student(10,"Vishal","@Gmail.com"));
    		list.add(new Student(11,"Vivek","@Gmail.com"));
    		list.add(new Student(12,"Vinod","@Gmail.com"));
    		list.add(new Student(13,"Vikey","@Gmail.com"));
    		list.add(new Student(14,null,"@Gmail.com"));
    	 }
     
     public  static boolean isNullable(String name) {
    	 
    	 String str=name;
    Optional<String> sname=Optional.ofNullable(str);
    	   sname.orElse("");    return sname.isPresent();
    	 
     }
     
	
	public void getStudent(int roll) {
		
	List<Student> lst=	list.stream().filter(x->x.getName()!=null).filter(x->x.getRoll()==roll).collect(Collectors.toList());
		
	

	}
	
	public OptionalClass() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		
	boolean bol= 	isNullable(null);
		System.out.println(bol);
	
		
		
		
		
		
	}

}
