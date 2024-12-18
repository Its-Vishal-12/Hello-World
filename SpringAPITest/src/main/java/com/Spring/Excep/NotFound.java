package com.Spring.Excep;

import org.springframework.http.HttpStatus;

public class NotFound {
	
	
	private String msg;
	
	private Throwable thr;
	
	private HttpStatus http;

	public NotFound(String msg, Throwable thr, HttpStatus http) {
		super();
		this.msg = msg;
		this.thr = thr;
		this.http = http;
	}

	public NotFound() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
