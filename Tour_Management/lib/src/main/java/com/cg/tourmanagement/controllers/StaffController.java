package com.cg.tourmanagement.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.tourmanagement.entities.Staff;
import com.cg.tourmanagement.entities.TourInfo;
import com.cg.tourmanagement.service.StaffService;

@RestController
@RequestMapping("/staff")
public class StaffController {
	@Autowired
	StaffService service;
	
//	@PostMapping("/add")
//	public Staff addStaff(@RequestBody Staff tour){
//		return service.addStaff(tour);
//	}
	

	@PostMapping
	public ResponseEntity<String> addStaff(@RequestBody Staff staff){
		service.addStaff(staff);
		return new ResponseEntity<String>("inserted", HttpStatus.OK);
	}
	
	
//	@PostMapping("/login")
//	public Staff login(@RequestBody Staff st){
//		Staff stlogin = service.ValidateUser(st);
//		return stlogin;
//	}
	
	@PostMapping("/get")
	public List<TourInfo> getAllTours()
	{
		List<TourInfo> lsttour = service.getAllTour();
		return lsttour;
	}
	
	/*@GetMapping("/confirm/{resId}")
	public void Confirm(@PathVariable int resId) {
		System.out.println(resId);	
		//int id = resId.getReserevdPackageId();
		//return service.Confirm(resId);
		return new ResponseEntity <boolean>(service.Confirm(resId) , HttpStatus.OK);
	}*/
	
	@GetMapping("/confirm/{resId}")
	public ResponseEntity<Optional<Boolean>> getTourById(@PathVariable int resId){
		Optional<Boolean> tour = Optional.of(service.Confirm(resId));
		return new ResponseEntity<Optional<Boolean>>(tour,HttpStatus.OK);
	}
}
