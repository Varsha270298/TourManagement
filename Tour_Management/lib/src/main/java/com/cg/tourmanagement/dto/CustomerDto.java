package com.cg.tourmanagement.dto;

import com.cg.tourmanagement.entities.TourInfo;
import com.cg.tourmanagement.entities.TourInformationSystem;

public class CustomerDto {
	private int customerId;
	private String userId;
	private int password;
	private String firstName;
	private String lastName;
	private long mobileNo;
	private int age;
	private String gender;
	private String modeOfPayment;
	private  int packageId;
	private int reserevdPackageId;
	
	public CustomerDto(int  customerId, String userId, int password, String firstName, String lastName, long mobileNo,
			int age, String gender, String modeOfPayment, int packageId, int reserevdPackageId) {
		
		this.customerId = customerId;
		this.userId = userId;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNo = mobileNo;
		this.age = age;
		this.gender = gender;
		this.modeOfPayment = modeOfPayment;
		this.packageId = packageId;
		this.reserevdPackageId = reserevdPackageId;
	}
	
	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
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
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getModeOfPayment() {
		return modeOfPayment;
	}
	public void setModeOfPayment(String modeOfPayment) {
		this.modeOfPayment = modeOfPayment;
	}
	public int getPackageId() {
		return packageId;
	}
	public void setPackageId(int packageId) {
		this.packageId = packageId;
	}
	public int getReserevdPackageId() {
		return reserevdPackageId;
	}
	public void setReserevdPackageId(int reserevdPackageId) {
		this.reserevdPackageId = reserevdPackageId;
	}
	
	
	
	
}
