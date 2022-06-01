package com.cg.tourmanagement.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.tourmanagement.dto.CustomerDto;
import com.cg.tourmanagement.dto.StaffDto;
import com.cg.tourmanagement.entities.Customer;
import com.cg.tourmanagement.entities.Staff;
import com.cg.tourmanagement.entities.TourInfo;
import com.cg.tourmanagement.exception.PaymentUnsccuessfullException;
import com.cg.tourmanagement.exception.StaffPasswordException;
import com.cg.tourmanagement.exception.StaffUserIdAlreadyExistsException;
import com.cg.tourmanagement.repository.CustomerRepository;
import com.cg.tourmanagement.repository.StaffRepository;
import com.cg.tourmanagement.repository.TourInfoRepository;

@Service 
public class StaffServiceImpl implements StaffService {

	@Autowired
    CustomerRepository  custRepo;

	@Autowired
	StaffRepository stfRepo;
	
	@Autowired
	TourInfoRepository trRepo;
	
	@Override
	public void addStaff(StaffDto staffdto) {
		
		TourInfo staf = trRepo.getReservePackageId(staffdto.getReserevdPackageId());
		Staff staff = new Staff();
		staff.setUserId(staffdto.getUserId());
		staff.setPassword(staffdto.getPassword());
		staff.setTourinfo(staf);
		staff.setStatus(staffdto.getStatus());
		stfRepo.save(staff);
		
	}
	

	
	@Override
	public List<TourInfo> getAllTour() {
		List<TourInfo> tourlist=trRepo.findAll();
		return tourlist;
		
	}



			
			
		
		
	}
	

