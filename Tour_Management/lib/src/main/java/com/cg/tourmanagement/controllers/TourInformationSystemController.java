package com.cg.tourmanagement.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.tourmanagement.entities.TourInformationSystem;
import com.cg.tourmanagement.service.TourInformationSystemServiceImpl;

@RestController
@RequestMapping("/tour")
public class TourInformationSystemController {
	@Autowired
	TourInformationSystemServiceImpl service;
	
	@PostMapping
	public ResponseEntity<String> addPackage(@RequestBody TourInformationSystem tour){
		service.addPackage(tour);
		return new ResponseEntity<String>("inserted", HttpStatus.OK);
	}
	@GetMapping
	public ResponseEntity<List<TourInformationSystem>> getAllTours() {
		List<TourInformationSystem> tourList = service.viewAllTours();
		return new ResponseEntity<List<TourInformationSystem>>(tourList,HttpStatus.OK);
	}
	@GetMapping("/id/{packageId}")
	public ResponseEntity<Optional<TourInformationSystem>> getTourById(@PathVariable int packageId){
		Optional<TourInformationSystem> tour = service.getTourById(packageId);
		return new ResponseEntity<Optional<TourInformationSystem>>(tour,HttpStatus.OK);
	}
	@PutMapping
	public ResponseEntity<String> editPackage(@RequestBody TourInformationSystem tour){
		service.updatePackage(tour);
		return new ResponseEntity<String>("updated",HttpStatus.OK);
	}
	@DeleteMapping("/id/{packageId}")
	public ResponseEntity<String> deletePackage(@PathVariable int packageId){
		service.deletePackage(packageId);
		return new ResponseEntity<String>("deleted",HttpStatus.OK);
	}
}









