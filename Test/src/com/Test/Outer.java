package com.Test;

 class Outerr {
	
	
	
	 Outerr() {
	System.out.println("Outer Constructor");	
	}

	static class Inner{
		 
		 
		 
		 Inner(){
			 System.out.println("Inner Constructor");
		 }
		 
		 
		 public static void Meth() {
			 
			 
			 class inner{
				 
				 inner(){
					 System.out.println("inner inner class"); 
					 
				 }
				 
			 }
			 
		 }
		 
	 }
	 
	 
	 
	 
}

 public class Outer{
	 
	 
	  public static void main(String[] args) {
		
		//  Outerr out=new Outerr();
		  
		//  Outerr.Inner in=new Outerr().new Inner();  Non Static
		  
	        Outerr.Inner in=new Outerr.Inner();  //static   
	        
	        
	       
		  
		  
	}
	  
 }
 