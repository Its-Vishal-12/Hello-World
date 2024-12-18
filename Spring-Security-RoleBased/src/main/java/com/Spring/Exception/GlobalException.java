package com.Spring.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {
	
	
	@ExceptionHandler(value=NotFound.class)
	public ResponseEntity<Object> notFound(NotFound notfound){
		
		UserException exp=new UserException(notfound.getMsg(),notfound.getCause(),HttpStatus.NOT_FOUND);
		
		return new ResponseEntity<>(exp,HttpStatus.NOT_FOUND);
		
		
	}
	
	
	
	
	

}
