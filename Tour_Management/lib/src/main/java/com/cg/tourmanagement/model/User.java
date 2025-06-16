package com.cg.tourmanagement.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "my_user")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class User {

	@Id
	@SequenceGenerator(name = "emp_seq", initialValue = 100,
    sequenceName = "emp_code_gen", allocationSize = 2)
    @GeneratedValue(generator = "emp_seq", strategy = GenerationType.SEQUENCE)
	private int id;

	@Column
	private String username;
	@Column
	// @JsonIgnore
	private String password;

	@Column
	private String role;



	public int getId() {
	return id;
	}



	public void setId(int id) {
	this.id = id;
	}



	public String getUsername() {
	return username;
	}



	public void setUsername(String username) {
	this.username = username;
	}



	public String getPassword() {
	return password;
	}



	public void setPassword(String password) {
	this.password = password;
	}



	public String getRole() {
	return role;
	}



	public void setRole(String role) {
	this.role = role;
	}



	public User(int id, String username, String password, String role) {
	super();
	this.id = id;
	this.username = username;
	this.password = password;
	this.role = role;
	}



	public User() {
	super();

	}



	@Override
	public String toString() {
	return "User [id=" + id + ", username=" + username + ", password=" + password + ", role=" + role + "]";
	}



	}
    

