package com.cg.tourmanagement.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="user_login")
public class Logins {
	@Id
	private String userId;
	@Column(name="password")
	private int password;
	@Column(name="role",length=20)
	private String role;
	
	public Logins() {
<<<<<<< HEAD
	}
	public Logins(String userId, int password, String role) {
=======
		
	}
	public Logins(String userId, int password, String role) {
		
>>>>>>> 63c1d070c96a08e85173e5299aa609fb0a5177d0
		this.userId = userId;
		this.password = password;
		this.role = role;
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
