package com.Spring.Exceptions;

import org.springframework.http.HttpStatus;

public class NotFoundException {
	
	private String msg;
	private Throwable thr;
	private HttpStatus status;
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Throwable getThr() {
		return thr;
	}
	public void setThr(Throwable thr) {
		this.thr = thr;
	}
	public HttpStatus getStatus() {
		return status;
	}
	public void setStatus(HttpStatus status) {
		this.status = status;
	}

	

	public NotFoundException() {
		
		
	}
	public NotFoundException(String msg) {
		super();
		
	}
	public NotFoundException(String msg, Throwable thr, HttpStatus status) {
		super();
		this.msg = msg;
		this.thr = thr;
		this.status = status;
	}
	@Override
	public String toString() {
		return "NotFoundException [msg=" + msg + ", thr=" + thr + ", status=" + status + "]";
	}
	
	
	
	
	
	

}
