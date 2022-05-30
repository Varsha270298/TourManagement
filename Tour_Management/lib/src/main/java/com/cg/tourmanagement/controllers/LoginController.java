package com.cg.tourmanagement.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.tourmanagement.dto.LoginDto;
import com.cg.tourmanagement.dto.TourInfoDto;
import com.cg.tourmanagement.service.LoginServiceImpl;

@RestController
@RequestMapping("/login")
public class LoginController {
	@Autowired
	LoginServiceImpl loginservice;
	
	@PostMapping
	public ResponseEntity<String>addLogin(@RequestBody LoginDto logindto){
	     loginservice.addLogins(logindto);
		return new ResponseEntity<String>("LoginSuccessful.............", HttpStatus.OK);
	}
	
	
	

}
