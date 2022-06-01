package com.cg.tourmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cg.tourmanagement.entities.TourInfo;
@Repository
public interface TourInfoRepository  extends JpaRepository<TourInfo, Integer>{
	@Transactional
	@Modifying
	//@Query("update t from TourInfo t set t.Status = 'Booked' where t.reserevdPackageId = :id")
	public int confirm(int id);


	@Query(value = "select tour from TourInfo  tour where tour.reserevdPackageId=?1")
	TourInfo getReservePackageId(int reserevdPackageId);



}
