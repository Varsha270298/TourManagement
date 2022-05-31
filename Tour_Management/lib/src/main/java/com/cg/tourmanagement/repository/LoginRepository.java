package com.cg.tourmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.tourmanagement.entities.Logins;
@Repository
public interface LoginRepository extends JpaRepository<Logins, String>{
	
	@Query(value="select login from Logins login where login.userId=?1 and  login.password=?2")
	Logins loginValidate(String userId,int password);
	
}

