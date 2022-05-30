package com.cg.tourmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.tourmanagement.entities.Logins;
@Repository
public interface LoginRepository extends JpaRepository<Logins, String>{
	@Query(value="select login from Logins login where login.role=?1")
	Logins deleteByRole(String role);
	@Query(value="select login from Logins login where login.userId=?1")
	Logins getLoginUserId(String userId);
	@Query(value="select login from Logins login where login.password=?1")
	Logins getLoginPassword(int password);
}

