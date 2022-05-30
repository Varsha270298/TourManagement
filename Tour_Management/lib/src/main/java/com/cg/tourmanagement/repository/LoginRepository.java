package com.cg.tourmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.tourmanagement.entities.Logins;
@Repository
public interface LoginRepository extends JpaRepository<Logins, String>{
}

