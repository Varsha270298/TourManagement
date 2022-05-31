package com.cg.tourmanagement.service;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.tourmanagement.dto.CustomerDto;
import com.cg.tourmanagement.dto.TourInfoDto;
import com.cg.tourmanagement.entities.Customer;
import com.cg.tourmanagement.entities.TourInfo;
import com.cg.tourmanagement.entities.TourInformationSystem;
import com.cg.tourmanagement.exception.UserIdAlreadyExistsException;
import com.cg.tourmanagement.exception.UserIdNotFoundException;
import com.cg.tourmanagement.repository.CustomerRepository;
import com.cg.tourmanagement.repository.TourInfoRepository;
import com.cg.tourmanagement.repository.TourInformationSystemRepository;

@Service
public class CustomerServiceImpl implements CustomerService{
	@Autowired
	CustomerRepository custrepo;
	@Autowired
	TourInformationSystemRepository tourrepo;
	@Autowired
	TourInfoRepository tourinforepo;

	@Override
	public int addCustomer(CustomerDto custdto)  {
		
		
		TourInfo tourinfo=tourinforepo.getReservePackageId(custdto.getReserevdPackageId());
		Customer cust=new Customer();
		cust.setAge(custdto.getAge());
		cust.setFirstName(custdto.getFirstName());
		cust.setLastName(custdto.getLastName());
		cust.setMobileNo(custdto.getMobileNo());
		cust.setGender(custdto.getGender());
		cust.setUserId(custdto.getUserId());
		cust.setPassword(custdto.getPassword());
		cust.setModeOfPayment(custdto.getModeOfPayment());
		cust.setTourinfo(tourinfo);
		custrepo.save(cust);
		return cust.getCustomerId();
		
	}

	

	@Override
	public void AddPackage(TourInfoDto tourinfodto) {
TourInformationSystem tour=tourrepo.getpackageId(tourinfodto.getPackageId());
		
		
		TourInfo tourinfo=new TourInfo();
		
		tourinfo.setPackageName(tourinfodto.getPackageName());
		tourinfo.setNoOfPersons(tourinfodto.getNoOfPersons());
		tourinfo.setNumberOfDays(tourinfodto.getNumberOfDays());
		tourinfo.setAmountPerPerson(tourinfodto.getAmountPerPerson());
		tourinfo.setConfirm(tourinfodto.getConfirm());
		Date startdate=new Date();
		tourinfo.setStartDate(startdate);
		
		Calendar cal=Calendar.getInstance();
		cal.setTime(startdate);
		cal.add(Calendar.YEAR,10);
		
		Date enddate=cal.getTime();
		tourinfo.setEndDate(enddate);
		tourinfo.setModeOfTransportation(tourinfodto.getModeOfTransportation());
		tourinfo.setHotel(tourinfodto.getHotel());
		tourinfo.setDescription(tourinfodto.getDescription());
		tourinfo.setTour(tour);
		tourinfo.setPayMode(tourinfodto.getPayMode());
		tourinfo.setStatus(tourinfodto.getStatus());
		tourinforepo.save(tourinfo);
		
		}

	@Override
	public void updateTourInfo(TourInfoDto tourinfodto) {
		TourInfo tourinfo=tourinforepo.getReservePackageId(tourinfodto.getReserevdPackageId());
		if(tourinfo == null)
			throw new UserIdNotFoundException(" Id Not Found......");
		
		TourInfo tour=new TourInfo();
		tourinforepo.save(tour);
		
		
	}

	@Override
	public Optional<TourInfo> viewreserevdPackageById(int reserevdPackageId) {
		
		Optional<TourInfo>tourinfo=tourinforepo.findById( reserevdPackageId);
		if(tourinfo == null)
			throw new UserIdNotFoundException(" Id Not Found......");
		return tourinfo;
	}

	@Override
	public void cancelRegistration(int customerId) {
		Customer customer=custrepo.getBycustId(customerId);
		if(customer == null)
			throw new UserIdNotFoundException(" Id Not Found......");
		Customer cust=custrepo.getBycustId(customerId);
		custrepo.delete(cust);
		
	}



	@Override
	public List<TourInformationSystem> getpackageName() {
		List<TourInformationSystem> tourlist=tourrepo.findAll();
		return tourlist;
	}



	
}
