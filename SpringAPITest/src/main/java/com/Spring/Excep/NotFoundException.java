package com.Spring.Excep;

import com.Spring.Entity.Entities;

public class NotFoundException extends RuntimeException  {
	
	String msg;
	

	public String getMsg() {
		return msg;
	}


	public void setMsg(String msg) {
		this.msg = msg;
	}

	

	public NotFoundException() {
		super();
		
	}

	public NotFoundException(String msg ) {
		super();
		this.msg = msg;
	}
	
	
	
	
	
	
	

}
