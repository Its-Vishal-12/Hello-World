package com.Spring.Controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.Spring.ExceptionFound.NotFound;
import com.Spring.Exceptions.NotFoundException;

@RestControllerAdvice
public class NotFoundHandler {
//	 @Autowired
//	  private  NotFound  exep;
	 
	 
	 @ExceptionHandler(value=NotFound.class)
	 public ResponseEntity<Object>  getResponseException(NotFound   exp){
		 
		 NotFoundException nf=new  NotFoundException(exp.getMessage(),exp.getCause(),HttpStatus.NOT_FOUND);
		 
		return  new ResponseEntity <>(nf,HttpStatus.NOT_FOUND);
		 
		 
		 
	 }
	 

}
