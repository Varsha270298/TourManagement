  package com.cg.tourmanagement.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="staff")
public class Staff {
	@Id
	private String userId;
	private String password;
	private String status;
	
	public TourInfo getTourinfo() {
		return tourinfo;
	}


	public void setTourinfo(TourInfo tourinfo) {
		this.tourinfo = tourinfo;
	}

	//@Column(name="modeofpayment",length=30)
	//private String modeOfPayment;
	@OneToOne
	@JoinColumn(name="reserevdPackageId")
	private TourInfo tourinfo;
	
	
	

	public Staff(String userId, String password, TourInfo tourinfo,String status) {
		super();
		this.userId = userId;
		this.password = password;
		this.tourinfo = tourinfo;
		this.status=status;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	//public String getModeOfPayment() {
		//return modeOfPayment;
	//}
	//public void setModeOfPayment(String modeOfPayment) {
		//this.modeOfPayment = modeOfPayment;
	//}

	public Staff() {
		super();
		}
	
	

}
