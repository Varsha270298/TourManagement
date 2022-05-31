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
	public void addLogins(LoginDto logindto) {
		Logins userid=loginrepo.getLoginUserId(logindto.getUserId());
		Logins pwd =loginrepo.getLoginPassword(logindto.getPassword());
		if(userid.equals(logindto.getUserId()))
			throw new UserIdAlreadyExistsException();
		
		
		Logins logins=new Logins();
		logins.setUserId(logindto.getUserId());
		logins.setPassword(logindto.getPassword());
		logins.setRole(logindto.getRole());
		loginrepo.save(logins);
		
	}
	@Override
	public void deleteLogin(LoginDto logindto) {
		Logins login=loginrepo.deleteByRole(logindto.getRole());
		loginrepo.delete(login);
		
	}
	

}
