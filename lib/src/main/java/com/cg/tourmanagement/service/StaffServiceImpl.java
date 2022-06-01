package com.cg.tourmanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.tourmanagement.entities.Staff;
import com.cg.tourmanagement.entities.TourInfo;
import com.cg.tourmanagement.exception.StaffPasswordException;
import com.cg.tourmanagement.exception.StaffUserIdAlreadyExistsException;
import com.cg.tourmanagement.repository.StaffRepository;
import com.cg.tourmanagement.repository.TourInfoRepository;

@Service 
public class StaffServiceImpl implements StaffService {

	@Autowired
	StaffRepository stfRepo;
	
	@Autowired
	TourInfoRepository trRepo;
	
	@Override
	public Staff addStaff(Staff staff) throws StaffUserIdAlreadyExistsException, StaffPasswordException {
		
		Staff staf = stfRepo.save(staff);
		return staf;	
	}
	
	@Override
	public Staff ValidateUser(Staff user) {
		String uid = user.getUserId();
		String pwd = user.getPassword();
		Staff st = stfRepo.Login(uid, pwd);
		return st;
	}
	
	
	@Override
	public List<TourInfo> getAllTour() {
		return trRepo.findAll();
	}
	
	@Override
	public boolean Confirm(int id) {
		int cnt = trRepo.confirm(id);
		if(cnt != 1) {
			return false;
		} else {
			return true;
		}
	}
/*
	@Override
	public Optional<Staff> getUserId(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void ViewPackage(TourInfo viewPackage) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void acceptPackage(TourInfo acceptPackage) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<TourInfo> reserevdPackageId(int reserevdPackageId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void cancelRegistration(int userId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getPassword(TourInfo viewPackage) {
		// TODO Auto-generated method stub
		
	}
	*/
}
