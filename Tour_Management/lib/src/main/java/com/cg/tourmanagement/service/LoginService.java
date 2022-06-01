package com.cg.tourmanagement.service;

import com.cg.tourmanagement.dto.LoginDto;
import com.cg.tourmanagement.entities.Logins;
import com.cg.tourmanagement.exception.UserIdAlreadyExistsException;

public interface LoginService {
//void addLogins(LoginDto logindto);


void addLogins(Logins logins);
void loginValidate(String userId,int password);  
	
}




