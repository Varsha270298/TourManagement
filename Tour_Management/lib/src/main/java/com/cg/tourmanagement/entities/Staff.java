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
	
	
	//@Column(name="modeofpayment",length=30)
	//private String modeOfPayment;
	@OneToOne
	@JoinColumn(name="reserevdPackageId")
	private TourInfo tourinfo;
	

	public Staff(String userId, String password) {
		super();
		this.userId = userId;
		this.password = password;
	}


	public Staff(String userId) {
		super();
		this.userId = userId;
	}



	public Staff(String userId, String modeOfPayment, TourInfo tourinfo) {
		super();
		this.userId = userId;
		//this.modeOfPayment = modeOfPayment;
		this.tourinfo = tourinfo;
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
