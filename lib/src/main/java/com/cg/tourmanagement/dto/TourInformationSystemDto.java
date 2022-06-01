package com.cg.tourmanagement.dto;

public class TourInformationSystemDto {
	
	private int packageId;
	private String packageName;
	private String description;
    private int numberOfDays;
    private double amountPerPerson;
	private String modeOfTransportation;
	private String hotel;
	private int customerId;
	public TourInformationSystemDto(int packageId, String packageName, String description, int numberOfDays,
			double amountPerPerson, String modeOfTransportation, String hotel, int customerId) {
		super();
		this.packageId = packageId;
		this.packageName = packageName;
		this.description = description;
		this.numberOfDays = numberOfDays;
		this.amountPerPerson = amountPerPerson;
		this.modeOfTransportation = modeOfTransportation;
		this.hotel = hotel;
		this.setCustomerId(customerId);
	}
	public int getPackageId() {
		return packageId;
	}
	public void setPackageId(int packageId) {
		this.packageId = packageId;
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
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
}
