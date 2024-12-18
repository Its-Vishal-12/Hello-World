package com.Core.Strings;

//import javax.swing.plaf.synth.SynthOptionPaneUI;

//to make  user define compile time exception


 class UserNotFound extends RuntimeException{
	 
	 
	 
	   private   String exp;
	 
	  UserNotFound(){
		  
	  }
	 
	  UserNotFound(String exp){
		  this.exp=exp;
	  }
	 
	 
	 
	 
	 
	 
 }
class Cexception extends Exception{
	
	
	Cexception(){
		super();
		System.out.println("Compile Time Exception"); 
	}
	
	Cexception(String name){
	super(name);
	System.out.println("Compile Time Exception");
	}
	}


class Rexception extends RuntimeException{
	
	Rexception(){
		super();
		//System.out.println("Run time Exception");
	}
	
	Rexception(String name){
		super(name);
		System.out.println("Run time Exception");
	}
	
	
	
}


public class CoreJavaException {

	public static void main(String[] args) {
		
//		String fname="Vishal";
//		String lname="Kumar";
//		
//		String name="Vishal";
//		
//		if(name.equals(lname)) {
//			
//			System.out.println("Name Matched:"+name);
//		
//		}else {
//			
//		try {
//			
//		throw new Rexception();
//		
//		}catch(Rexception e) {
//			System.out.println("Exception Terminated");
//			e.printStackTrace();
//		}
//		}
//		
		
		//Create Run Time Exception
		
		
		int x=2;
		int y=46;
		
		if(x>y) {
			System.out.println("No");
		}else {
			
		throw	new UserNotFound("Not Found");
			
		}
		
		
		 
		
		

	}

}
