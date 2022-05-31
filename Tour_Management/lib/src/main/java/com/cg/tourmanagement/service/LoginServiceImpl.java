package com.cg.tourmanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.tourmanagement.dto.LoginDto;
import com.cg.tourmanagement.entities.Logins;
import com.cg.tourmanagement.exception.UserIdAlreadyExistsException;
import com.cg.tourmanagement.repository.LoginRepository;
@Service
public class LoginServiceImpl implements LoginService{

	@Autowired
	LoginRepository loginrepo;
	@Override
<<<<<<< HEAD
	public void addLogins(LoginDto logindto) {
=======
	public void addLogins(Logins logins) {
>>>>>>> 63c1d070c96a08e85173e5299aa609fb0a5177d0
		
		//Logins login = new Logins();
		
		loginrepo.save(logins);
<<<<<<< HEAD
		
	}
	
	
=======
	
		}
	@Override
	public void loginValidate(String userId, int password) {
		Logins login = loginrepo.loginValidate(userId, password);
		if(login==null) {
			throw new UserIdAlreadyExistsException("value Already exist");
		}
		if(login.equals(userId)) {
			throw new UserIdAlreadyExistsException("Invalid ");
		}
		
		}
	}
>>>>>>> 63c1d070c96a08e85173e5299aa609fb0a5177d0
	
	
