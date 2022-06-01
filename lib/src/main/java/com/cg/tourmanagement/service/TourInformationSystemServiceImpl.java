package com.cg.tourmanagement.service;

//import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.cg.tourmanagement.dto.TourInformationSystemDto;
//import com.cg.tourmanagement.entities.Customer;
import com.cg.tourmanagement.entities.TourInformationSystem;
import com.cg.tourmanagement.exception.TourInformationSystemAlreadyExistException;
import com.cg.tourmanagement.exception.TourInformationSystemNotFoundException;
//import com.cg.tourmanagement.repository.CustomerRepository;
import com.cg.tourmanagement.repository.TourInformationSystemRepository;

@Service
public class TourInformationSystemServiceImpl implements TourInformationSystemService {

	@Autowired
	TourInformationSystemRepository tourrepo;
//	@Autowired
//	CustomerRepository custrepo;
	@Override
	public void addPackage(TourInformationSystem tour) throws TourInformationSystemAlreadyExistException {
		tourrepo.save(tour);
		
	}
	@Override
	public List<TourInformationSystem> viewAllTours() {
		// TODO Auto-generated method stub
		return tourrepo.findAll();
	}
	@Override
	public Optional<TourInformationSystem> getTourById(int packageId) throws TourInformationSystemNotFoundException {
			Optional<TourInformationSystem> tour = tourrepo.findById(packageId);
		if(!tour.isPresent())
				throw new TourInformationSystemNotFoundException();
		return tour;
		}
	@Override
	public void updatePackage(TourInformationSystem tour) {
		// TODO Auto-generated method stub
	
		
		
		tourrepo.save(tour);
		
	}
	@Override
	public void deletePackage(int packageId) {
		// TODO Auto-generated method stub
		Optional<TourInformationSystem> tour = tourrepo.findById(packageId);
		if(!tour.isPresent())
			throw new TourInformationSystemNotFoundException();
		else
		tourrepo.deleteById(packageId);
		
	}
	

	
	/*public void addPackage(TourInformationSystemDto tourdto) throws TourInformationSystemAlreadyExistException {
		Customer cust = custrepo.getcustomerId(tourdto.getCustomerId());
		TourInformationSystem tour= new TourInformationSystem();
		tour.setPackageName(tourdto.getPackageName());
		tour.setCustomer(cust);
		tour.setHotel(tourdto.getHotel());
		tour.setDescription(tourdto.getDescription());
		tour.setAmountPerPerson(tour.getAmountPerPerson());
		tour.setNumberOfDays(tour.getNumberOfDays());
		tour.setPackageId(tour.getPackageId());
		tour.setModeOfTransportation(tour.getModeOfTransportation());
		tourrepo.save(tour);
		
	}*/

	





	
	
	}

	
		
	
	
	
	
	



