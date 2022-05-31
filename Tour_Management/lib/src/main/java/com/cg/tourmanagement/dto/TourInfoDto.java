package com.cg.tourmanagement.dto;

import java.util.Date;

import com.cg.tourmanagement.entities.TourInformationSystem;

public class TourInfoDto {
	private int reserevdPackageId;
	private String  packageName;
	private String description;
	private Date startDate;
	private Date endDate;
	private int noOfPersons;
	private int numberOfDays;
	private double amountPerPerson;
	private String modeOfTransportation;
	private String hotel;
	private  int packageId;
	private String payMode; 
	private String status;
	private String confirm;
	public TourInfoDto(int reserevdPackageId, String packageName, String description, Date startDate, Date endDate,
			int noOfPersons, int numberOfDays, double amountPerPerson, String modeOfTransportation, String hotel,
			int packageId, String payMode, String status, String confirm) {
		this.reserevdPackageId = reserevdPackageId;
		this.packageName = packageName;
		this.description = description;
		this.startDate = startDate;
		this.endDate = endDate;
		this.noOfPersons = noOfPersons;
		this.numberOfDays = numberOfDays;
		this.amountPerPerson = amountPerPerson;
		this.modeOfTransportation = modeOfTransportation;
		this.hotel = hotel;
		this.packageId = packageId;
		this.payMode = payMode;
		this.status = status;
		this.confirm = confirm;
	}
	
	public TourInfoDto() {
	}
	

	

	public int getReserevdPackageId() {
		return reserevdPackageId;
	}
	public void setReserevdPackageId(int reserevdPackageId) {
		this.reserevdPackageId = reserevdPackageId;
	}
	public String getPackageName() {
		return packageName;
	}
	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public int getNoOfPersons() {
		return noOfPersons;
	}
	public void setNoOfPersons(int noOfPersons) {
		this.noOfPersons = noOfPersons;
	}
	public int getNumberOfDays() {
		return numberOfDays;
	}
	public void setNumberOfDays(int numberOfDays) {
		this.numberOfDays = numberOfDays;
	}
	public double getAmountPerPerson() {
		return amountPerPerson;
	}
	public void setAmountPerPerson(double amountPerPerson) {
		this.amountPerPerson = amountPerPerson;
	}
	public String getModeOfTransportation() {
		return modeOfTransportation;
	}
	public void setModeOfTransportation(String modeOfTransportation) {
		this.modeOfTransportation = modeOfTransportation;
	}
	public String getHotel() {
		return hotel;
	}
	public void setHotel(String hotel) {
		this.hotel = hotel;
	}
	public int getPackageId() {
		return packageId;
	}
	public void setPackageId(int packageId) {
		this.packageId = packageId;
	}
	public String getPayMode() {
		return payMode;
	}
	public void setPayMode(String payMode) {
		this.payMode = payMode;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getConfirm() {
		return confirm;
	}
	public void setConfirm(String confirm) {
		this.confirm = confirm;
	}
	
	
	
	
	
	


	
}
