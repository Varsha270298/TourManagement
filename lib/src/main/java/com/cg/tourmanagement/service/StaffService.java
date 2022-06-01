package com.cg.tourmanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.cg.tourmanagement.entities.Staff;
import com.cg.tourmanagement.entities.TourInfo;
import com.cg.tourmanagement.exception.StaffPasswordException;
import com.cg.tourmanagement.exception.StaffUserIdAlreadyExistsException;


public interface StaffService {
	Staff addStaff (Staff staff) throws StaffUserIdAlreadyExistsException, StaffPasswordException;
	/*Optional<Staff> getUserId(String userId);
	void getPassword(TourInfo viewPackage);
	void acceptPackage(TourInfo acceptPackage);
	Optional<TourInfo> reserevdPackageId(int reserevdPackageId);
	void cancelRegistration(int userId );
	void ViewPackage(TourInfo viewPackage);*/
	Staff ValidateUser(Staff user);
	List<TourInfo> getAllTour();
	boolean Confirm(int id);
}
