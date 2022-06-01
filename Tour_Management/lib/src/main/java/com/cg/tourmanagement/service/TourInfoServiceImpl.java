package com.cg.tourmanagement.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.cg.tourmanagement.entities.TourInfo;
import com.cg.tourmanagement.repository.TourInfoRepository;

public class TourInfoServiceImpl implements TourInfoService{

@Autowired
	TourInfoRepository tourinforepo;
	
	
	public TourInfoServiceImpl(TourInfoRepository tourinforepo) {
		super();
		this.tourinforepo = tourinforepo;
	}


	@Override
	public List<TourInfo> viewAllReservedTourPackages() {
		// TODO Auto-generated method stub
		return  tourinforepo.findAll();
		
	}
	
	}