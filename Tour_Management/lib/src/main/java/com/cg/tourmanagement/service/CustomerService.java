package com.cg.tourmanagement.service;

import java.util.List;
import java.util.Optional;

import com.cg.tourmanagement.dto.CustomerDto;
import com.cg.tourmanagement.dto.TourInfoDto;
import com.cg.tourmanagement.entities.TourInfo;
import com.cg.tourmanagement.entities.TourInformationSystem;
import com.cg.tourmanagement.exception.UserIdAlreadyExistsException;

//@Service
public interface CustomerService {
	int addCustomer(CustomerDto custdto);
	List<TourInformationSystem> getpackageName();
	void AddPackage(TourInfoDto tourinfodto);
	void updateTourInfo(TourInfoDto tourinfodto);
	Optional<TourInfo> viewreserevdPackageById(int reserevdPackageId);
	void cancelRegistration(int customerId );

}
