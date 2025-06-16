package com.cg.tourmanagement.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.tourmanagement.model.User;




public interface UserDao extends CrudRepository<User, Integer> {

	User findByUsername(String username);
	


}

    
	

