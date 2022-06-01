package com.cg.tourmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.cg.tourmanagement.entities.TourInfo;
@Repository
public interface TourInfoRepository  extends JpaRepository<TourInfo, Integer>{
      


	@Query(value = "select tour from TourInfo  tour where tour.reserevdPackageId=?1")
	TourInfo getReservePackageId(int reserevdPackageId);



}
