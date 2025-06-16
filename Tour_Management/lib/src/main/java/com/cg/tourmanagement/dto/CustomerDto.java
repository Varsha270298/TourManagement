package com.cg.tourmanagement.dto;

public class CustomerDto {
	private int id;
	private String username;
	private String password;
	private String firstName;
	private String lastName;
	private long mobileNo;
	private int age;
	private String gender;
	private String modeOfPayment;
	private int reserevdPackageId;
	
	
	public CustomerDto(int id, String username, String password, String firstName, String lastName, long mobileNo,
			int age, String gender, String modeOfPayment, int reserevdPackageId) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNo = mobileNo;
		this.age = age;
		this.gender = gender;
		this.modeOfPayment = modeOfPayment;
		this.reserevdPackageId = reserevdPackageId;
	}


	@Override
	public String toString() {
		return "CustomerDto [id=" + id + ", username=" + username + ", password=" + password + ", firstName="
				+ firstName + ", lastName=" + lastName + ", mobileNo=" + mobileNo + ", age=" + age + ", gender="
				+ gender + ", modeOfPayment=" + modeOfPayment + ", reserevdPackageId=" + reserevdPackageId + "]";
	}


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


	public int getReserevdPackageId() {
		return reserevdPackageId;
	}


	public void setReserevdPackageId(int reserevdPackageId) {
		this.reserevdPackageId = reserevdPackageId;
	}


	public CustomerDto() {
	}

}
