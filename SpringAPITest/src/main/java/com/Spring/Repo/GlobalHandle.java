package com.Spring.Repo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.Spring.Excep.NotFound;
import com.Spring.Excep.NotFoundException;

@RestControllerAdvice
public class GlobalHandle {
	
	
	@ExceptionHandler(value=NotFoundException.class)
	public ResponseEntity<NotFound>  getException(NotFoundException  not) {
		
		
		NotFound nn=  new	NotFound(not.getMsg(),not.getCause(),HttpStatus.CONFLICT);
		
		return  new ResponseEntity<>(nn,HttpStatus.CONFLICT);
		
	}
	
	
	
	
	
	

}
