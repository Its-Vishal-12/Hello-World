package com.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Testing {

	public static void main(String[] args) {
		
		
		int [] arr= {2,7,4,9,1,0};
		
		 int var=0;
		 int sum=0;
		 for(int i=0;i<arr.length-1;i++) {
		if(var<arr[i]) {  //1,2,3,4,5,6
			
			var=arr[i];//2,7,*4,9,*1,*0
		    sum=var; //2,7,*4,9,*1,*0
			System.out.print(var); //2,7,9
		}	 
		 }
		 System.out.println("\n"+"second: "+sum);
		
	List<Integer> list=	Arrays.asList(2,7,4,9,1,0,5,8,4,0,3,7,8,25,90);
	             	 
	         List<Integer>ll=list.stream().sorted(Comparator.comparingInt(Integer::valueOf)).collect(Collectors.toList());	 
		 
	         int size=ll.size();
	         System.out.println("Size:"+size);
	         
	         List lastsecond =  ll.subList(size-2, size-1);
	         int seclast=(int)lastsecond.get(0);
	         System.out.println("Sec Last:"+seclast);
	         
		
	         
	         
	     String n="Vishal";
		 String n2=n;
		 String n3=new String(n2);
		 System.out.println(n==n2);
		 System.out.println(n==n3);
		 
		 String  st="vishall";
		 String st2="hlaisv";
		 int count=0;
		 
		  char []a= st.toCharArray();
		 
		   char[]b=st2.toCharArray();
		 
		    for(int i=0;i<a.length-1;i++) {
		    	 System.out.println(a[i]);
		    	 
		    	for(int j=a[i]+1;j< b.length-1;j++) {
		    		
		    		
		    		System.out.println(b[j]);
		    		
		    		
		    		if(b[j]==a[i]) {
		    			
		    			System.out.println("Match");
		    			count++;
		    			
		    		}else {
		    			System.out.println("Not Match");
		    			count--;}
		    	} }
		    	System.out.println("Count"+count);
		    	
		    	
		    	
		   //Compile time exceptions 	
		    	
		   // ex->I/O Exception
		  
		    	
		    try {
				FileInputStream  eis=new FileInputStream("desktop/sgs");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println("Exception Occur");
			}
		 
		   try {
			Class.forName("Java.class");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception Occur");
		}
		
		   
		   //runtime Exception
		   
		String name=null;
		
		
		String nn=name.concat("Kumar");
		System.out.println(nn);

	}

}
