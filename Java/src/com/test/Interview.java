package com.test;

import java.util.ArrayList;
import java.util.List;

public class Interview {

	public static void main(String[] args) {
		
		
		String name="Vishal";                //inside SCP   
		String name2=new String("Vishal");   //inside SCP and Heap will ref heap
		
		System.out.println(name.equals(name2)); // true   content body
		
		System.out.println(name==name2); //false //refference
		
		String sname="Vishal";
         System.out.println(sname==name); //true  reff same scp literals	
         
         String hname=new String("Vishal");
         System.out.println(hname==sname);   //false
         
         System.out.println(hname==name2);  //false
         
         
         
         String s="        Vishal Kumar     ";    //inside scp
          String s1=s.trim();  
          System.out.println(s1);
          System.out.println(s==s1);  //false
		
          String s2=new String("ABC");  //scp and heap
    	  String s3=new String("abc"); 
    	  System.out.println(s2==s3);   //false
    	  
    	String s4="TEST";     //scp
  		String s5="test";      //scp
  		System.out.println(s4==s5);  //false
  		
  		System.out.println(s4.equals(s5));//false
  		
  		System.out.println(s4.equalsIgnoreCase(s5));  //true;
  		
  		
  		String s6="TEST";      //inside scp
  		
		System.out.println(s4==s6);     //true  
		
		String s7="Hello";              //inside scp
		
		s4= s7.concat("world");        //scp
		 
		System.out.println(s7==s4);   //false 
		
		 String s8="Hello World";  
		 String s9=s7+" World";
		 System.out.println(s9==s8);  //false
		 
		 
		 final String  s10="Hello";      //scp  important
		 String s11=s10+" World";        //hm
		 System.out.println(s8==s11);  //true
		 
		 
		 //COLLECTIONS
		 
		 List<Integer> list=new ArrayList<>();
		 
		 
		 
		

	}

}
