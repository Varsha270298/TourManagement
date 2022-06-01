package com.cg.tourmanagement.service;

import java.util.List;

import com.cg.tourmanagement.dto.CustomerDto;
import com.cg.tourmanagement.dto.StaffDto;
import com.cg.tourmanagement.entities.TourInfo;


public interface StaffService {
	void addStaff (StaffDto staffdto);
	List<TourInfo> getAllTour();
	
}
