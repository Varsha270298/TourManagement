package com.cg.tourmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.tourmanagement.entities.Staff;
@Repository
public interface StaffRepository extends JpaRepository< Staff , String> {
	
	@Query(value = "select staff from Staff  staff where staff.userId=?1")
	Staff getByuserId(String uid);
	
	
	
	
}