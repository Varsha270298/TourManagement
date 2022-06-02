package com.cg.tourmanagement.dto;

public class StaffDto {
	private String userId;
	private String password;
	private int reserevdPackageId;
	private String status;
	
	public StaffDto(String userId, String password, int reserevdPackageId,String status) {
		super();
		this.userId = userId;
		this.password = password;
		this.reserevdPackageId = reserevdPackageId;
		this.status=status;
	}

	public StaffDto() {
		super();

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

	public int getReserevdPackageId() {
		return reserevdPackageId;
	}

	public void setReserevdPackageId(int reserevdPackageId) {
		this.reserevdPackageId = reserevdPackageId;
	}
	
	
}
