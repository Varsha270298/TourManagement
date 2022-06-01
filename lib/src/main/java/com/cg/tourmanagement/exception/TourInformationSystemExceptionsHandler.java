package com.cg.tourmanagement.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class TourInformationSystemExceptionsHandler {
	@ExceptionHandler(value=TourInformationSystemNotFoundException.class)
	public ResponseEntity<Object> exception(TourInformationSystemNotFoundException exception){
		return new ResponseEntity<Object>("TourInformationSystem not found...",HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(value=TourInformationSystemAlreadyExistException.class)
	public ResponseEntity<Object> exception(TourInformationSystemAlreadyExistException exception){
		return new ResponseEntity<Object>("TourInformationSystem Already Exists...",HttpStatus.NOT_FOUND);
	}

}
