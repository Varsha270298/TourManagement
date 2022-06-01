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
	private String modeOfTransportation;
	private String hotel;
	private  int packageId;
	public TourInfoDto(int reserevdPackageId, String packageName, String description, Date startDate, Date endDate,
			int noOfPersons, int numberOfDays, String modeOfTransportation, String hotel, int packageId) {
		this.reserevdPackageId = reserevdPackageId;
		this.packageName = packageName;
		this.description = description;
		this.startDate = startDate;
		this.endDate = endDate;
		this.noOfPersons = noOfPersons;
		this.numberOfDays = numberOfDays;
		this.modeOfTransportation = modeOfTransportation;
		this.hotel = hotel;
		this.packageId = packageId;
		
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
	
}
