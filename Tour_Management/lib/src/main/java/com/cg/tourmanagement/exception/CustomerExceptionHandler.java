package com.cg.tourmanagement.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomerExceptionHandler {
	
	@ExceptionHandler(value=CustomerUserIdAlreadyExistsException.class)
	public ResponseEntity<Object> exception(CustomerUserIdAlreadyExistsException exception){
		return new ResponseEntity<Object>("Customer UserId AlreadyExist......",HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(value=CustomerPasswordException.class)
	public ResponseEntity<Object> exception(CustomerPasswordException exception){
		return new ResponseEntity<Object>("Entered Password is Invalid",HttpStatus.NOT_FOUND);
	}
}
