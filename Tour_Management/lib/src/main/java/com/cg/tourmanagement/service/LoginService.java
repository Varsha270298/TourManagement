package com.cg.tourmanagement.service;

import com.cg.tourmanagement.dto.LoginDto;
import com.cg.tourmanagement.entities.Logins;
import com.cg.tourmanagement.exception.UserIdAlreadyExistsException;

public interface LoginService {
<<<<<<< HEAD
void addLogins(LoginDto logindto);


=======
void addLogins(Logins logins);
void loginValidate(String userId,int password);  
	
>>>>>>> 63c1d070c96a08e85173e5299aa609fb0a5177d0
}




