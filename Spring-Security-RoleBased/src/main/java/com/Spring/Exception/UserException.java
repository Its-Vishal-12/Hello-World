package com.Spring.Exception;

import org.springframework.http.HttpStatus;

public class UserException {
	
	  private String msg;
	   private Throwable cause;
	   HttpStatus  status;
	public UserException(String msg, Throwable cause, HttpStatus status) {
		super();
		this.msg = msg;
		this.cause = cause;
		this.status = status;
	}
	   
	public UserException() {}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Throwable getCause() {
		return cause;
	}

	public void setCause(Throwable cause) {
		this.cause = cause;
	}

	public HttpStatus getStatus() {
		return status;
	}

	public void setStatus(HttpStatus status) {
		this.status = status;
	}
	
	

}
