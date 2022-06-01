package com.cg.tourmanagement.service;

import com.cg.tourmanagement.entities.Logins;

public interface LoginService {
void addLogins(Logins logins);
void loginValidate(String userId,int password);  
	
}