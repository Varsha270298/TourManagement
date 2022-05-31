package com.cg.tourmanagement.dto;

public class LoginDto {
private String userId;
private int password;
private String role;
public LoginDto(String userId, int password, String role) {
	this.userId = userId;
	this.password = password;
	this.role = role;
	
}
public LoginDto() {
	
}
public String getUserId() {
	return userId;
}
public void setUserId(String userId) {
	this.userId = userId;
}
public int getPassword() {
	return password;
}
public void setPassword(int password) {
	this.password = password;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}

}
