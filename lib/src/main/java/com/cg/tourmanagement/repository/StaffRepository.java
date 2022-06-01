package com.cg.tourmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.tourmanagement.entities.Staff;
@Repository
public interface StaffRepository extends JpaRepository< Staff , String> {
	
	@Query("Select s from Staff s where s.userId = :uid and s.password = :pwd")
	public Staff Login(String uid, String pwd);
}