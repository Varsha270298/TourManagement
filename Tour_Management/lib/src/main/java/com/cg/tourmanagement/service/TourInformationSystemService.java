package com.cg.tourmanagement.service;
import java.util.List;
import java.util.Optional;

import com.cg.tourmanagement.entities.TourInformationSystem;
import com.cg.tourmanagement.exception.TourInformationSystemAlreadyExistException;
import com.cg.tourmanagement.exception.TourInformationSystemNotFoundException;

public interface TourInformationSystemService {

	void addPackage (TourInformationSystem tour) throws TourInformationSystemAlreadyExistException;
	List<TourInformationSystem> viewAllTours();
	Optional<TourInformationSystem> getTourById(int packageId) throws TourInformationSystemNotFoundException;
	void updatePackage(TourInformationSystem tour);
	void deletePackage(int packageId);

}
