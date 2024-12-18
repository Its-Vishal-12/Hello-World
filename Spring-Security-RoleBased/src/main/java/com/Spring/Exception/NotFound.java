package com.Spring.Exception;

public class NotFound extends RuntimeException {

 private String msg;

public String getMsg() {
	return msg;
}

public void setMsg(String msg) {
	this.msg = msg;
}

public NotFound(String msg) {
	super();
	this.msg = msg;
}

public NotFound() {
	super();
	// TODO Auto-generated constructor stub
}



public NotFound(String message, Throwable cause) {
	super(message, cause);
	// TODO Auto-generated constructor stub
}

public NotFound(Throwable cause) {
	super(cause);
	// TODO Auto-generated constructor stub
}
 
 
 
	
	
	
}
