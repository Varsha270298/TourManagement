package com.cg.tourmanagement.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="tourinformationsystem")

public class TourInformationSystem {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int packageId;
	@Column(name="packagename",length=30)
	private String packageName;
	@Column(name="description",length=30)
	private String description;
	@Column(name="no_of_days")
	private int numberOfDays;
	@Column(name="amount_per_person")
	private double amountPerPerson;
	@Column(name="transportation",length=10)
	private String modeOfTransportation;
	@Column(name="hotel",length=30)
	private String hotel;
//	@OneToOne
//	@JoinColumn(name="customerId")
//	private Customer customer;
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
//	public Customer getCustomer() {
//		return customer;
//	}
//	public void setCustomer(Customer customer) {
//		this.customer = customer;
//	}
	
	

}