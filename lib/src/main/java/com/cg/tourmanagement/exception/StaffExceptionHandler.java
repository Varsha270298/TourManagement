package com.cg.tourmanagement.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class StaffExceptionHandler {

	@ExceptionHandler(value=CustomerUserIdAlreadyExistsException.class)
	public ResponseEntity<Object> exception(StaffUserIdAlreadyExistsException exception){
		return new ResponseEntity<Object>("Staff UserId AlreadyExist......",HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(value=StaffPasswordException.class)
	public ResponseEntity<Object> exception(StaffPasswordException exception){
		return new ResponseEntity<Object>("Entered Password is Invalid",HttpStatus.NOT_FOUND);
	}
}
