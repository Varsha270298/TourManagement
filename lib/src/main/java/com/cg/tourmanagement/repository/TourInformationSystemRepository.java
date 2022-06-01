package com.cg.tourmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.tourmanagement.entities.TourInformationSystem;

@Repository
public interface TourInformationSystemRepository extends JpaRepository<TourInformationSystem, Integer> {
	@Query(value = "select tour from TourInformationSystem  tour where tour.packageId=?1")
	TourInformationSystem getpackageId(int packageId);
}
