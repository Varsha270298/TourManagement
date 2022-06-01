package com.cg.tourmanagement.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.tourmanagement.dto.StaffDto;
import com.cg.tourmanagement.entities.TourInfo;
import com.cg.tourmanagement.service.StaffService;

@RestController
@RequestMapping("/staff")
public class StaffController {
	@Autowired
	StaffService service;

	@PostMapping("/staff")
	public ResponseEntity<String>addStaff(@RequestBody StaffDto staffdto){
		service.addStaff(staffdto);
	return new ResponseEntity<String>("inserted", HttpStatus.OK);
	}
	@GetMapping
	public ResponseEntity<List<TourInfo>> ViewAll(){
		List<TourInfo> tourlist=service.getAllTour();
		return new ResponseEntity<List<TourInfo>>(tourlist,HttpStatus.OK);
	}
	
	}