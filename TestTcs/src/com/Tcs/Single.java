package com.Tcs;

//Singleton design pattern

class Singleton{
	
	private static Singleton single;
	
	
	 private Singleton(){
		
		single=new Singleton();
		
	}
	
	public static Singleton getSingleton() {
		
		return single; 
	}
	
	
}





public class Single {

	public static void main(String[] args) {
		
	Singleton sg=	Singleton.getSingleton();
		
		
		

	}

}
