package com.cg.tourmanagement.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.cg.tourmanagement.service.CustomerServiceImpl;

import com.cg.tourmanagement.dto.CustomerDto;
import com.cg.tourmanagement.dto.TourInfoDto;
import com.cg.tourmanagement.entities.TourInfo;

@RestController
@RequestMapping("/cust")
public class CustomerController {
	@Autowired
    CustomerServiceImpl custservice;
	@PostMapping("/addcust")
	public ResponseEntity<String> addCustomer(@RequestBody CustomerDto custdto){
		custservice.addCustomer(custdto);;
		return new ResponseEntity<String>("inserted", HttpStatus.OK);
	
	}
	
	@PostMapping("/reservetour")
	public ResponseEntity<String>addPackage(@RequestBody TourInfoDto tourdto){
	custservice.AddPackage(tourdto);
		return new ResponseEntity<String>("inserted", HttpStatus.OK);
	}
	
	@DeleteMapping("/id/{customerid}")
	public ResponseEntity<String>cancelRegistration(@RequestBody int customerId){
	custservice.cancelRegistration(customerId);
		return new ResponseEntity<String>("deleted", HttpStatus.OK);
	}
	@GetMapping("/id/{reserevdPackageId}")
	public ResponseEntity<Optional<TourInfo>> getreservetourById(@PathVariable int reserevdPackageId ){
		Optional<TourInfo> tour = custservice.viewreserevdPackageById(reserevdPackageId);
		return new ResponseEntity<Optional<TourInfo>>(tour,HttpStatus.OK);
	}
	@PutMapping("/updatereservetour")
	public ResponseEntity<String> editpackage(@RequestBody  TourInfoDto tourinfo ){
		custservice.updateTourInfo(tourinfo);
		return new ResponseEntity<String>("updated",HttpStatus.OK);
	}



	
	
}
