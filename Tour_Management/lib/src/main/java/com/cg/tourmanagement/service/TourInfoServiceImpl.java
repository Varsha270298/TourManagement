package com.cg.tourmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.tourmanagement.entities.TourInfo;
import com.cg.tourmanagement.repository.TourInfoRepository;
import com.cg.tourmanagement.repository.TourInformationSystemRepository;

public class TourInfoServiceImpl implements TourInfoService{

	@Autowired
	TourInfoRepository tourinforepo;
	@Override
	public List<TourInfo> viewAllReservedTourPackages() {
		// TODO Auto-generated method stub
		return ((JpaRepository<TourInfo,Integer>) tourinforepo).findAll();
	}
	
	
}
