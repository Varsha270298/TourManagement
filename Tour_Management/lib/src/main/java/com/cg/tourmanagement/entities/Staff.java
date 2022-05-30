package com.cg.tourmanagement.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="staff")
public class Staff {
	@Id
	private String userId;
	@SequenceGenerator(name = "pwd_seq", initialValue = 1001, 
			sequenceName = "pwd_code_gen", allocationSize =35)
	@GeneratedValue(generator = "pwd_seq", strategy = GenerationType.SEQUENCE)
	private String password;
	
	
	@Column(name="modeofpayment",length=30)
	private String modeOfPayment;
	@OneToOne
	@JoinColumn(name="reserevdPackageId")
	private TourInfo tourinfo;
	
	
	public Staff(String userId, String password, String modeOfPayment) {
		super();
		this.userId = userId;
		this.password = password;
		this.modeOfPayment = modeOfPayment;
	}

	public Staff(String userId, String password) {
		super();
		this.userId = userId;
		this.password = password;
	}

	

	public Staff(String userId, String modeOfPayment, TourInfo tourinfo) {
		super();
		this.userId = userId;
		this.modeOfPayment = modeOfPayment;
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
	public String getModeOfPayment() {
		return modeOfPayment;
	}
	public void setModeOfPayment(String modeOfPayment) {
		this.modeOfPayment = modeOfPayment;
	}
	
	

}
