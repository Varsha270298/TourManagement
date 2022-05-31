package com.cg.tourmanagement.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int customerId;
	@Column(name="user_id",length=30)
	private String userId;
	@Column(name="password")
	private int password;
	@Column(name="firstname",length=30)
	private String firstName;
	@Column(name="lastname",length=30)
	private String lastName;
	@Column(name="mobileno")
	private long mobileNo;
	@Column(name="age")
	private int age;
	@Column(name="gender",length=10)	
	private String gender;
	@Column(name="modeofpayment",length=30)
	private String modeOfPayment;
	@OneToOne
	@JoinColumn(name="reserevdPackageId")
	private TourInfo  tourinfo;
	
	
	public Customer() {
		
	}
	public Customer(int customerId, String userId, int password, String firstName, String lastName, long mobileNo,
			int age, String gender, String modeOfPayment, TourInfo tourinfo) {
		this.customerId = customerId;
		this.userId = userId;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNo = mobileNo;
		this.age = age;
		this.gender = gender;
		this.modeOfPayment = modeOfPayment;
		this.tourinfo = tourinfo;
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
	
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
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
	public TourInfo getTourinfo() {
		return tourinfo;
	}
	public void setTourinfo(TourInfo tourinfo) {
		this.tourinfo = tourinfo;
	}
	
}