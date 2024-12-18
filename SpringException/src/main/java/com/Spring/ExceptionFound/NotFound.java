package com.Spring.ExceptionFound;

public class NotFound  extends RuntimeException {
	
	 private String msg;
	
	 public NotFound(){
			super();
		}
	 
	public NotFound(String msg){
		super(msg);
	}
	
	 public NotFound(String msg , Throwable cause){
		 super(msg, cause);
		 this.msg=msg;
		
	}

}
