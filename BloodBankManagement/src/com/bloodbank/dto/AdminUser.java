package com.bloodbank.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class AdminUser {

	@Id
	@GeneratedValue
	private int adUserId;
	private String userName;
	private String password;
	
	public int getAdUserId() {
		return adUserId;
	}
	public void setAdUserId(int adUserId) {
		this.adUserId = adUserId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	
	@Override
	public String toString() {
		return "AdminUser [adUserId=" + adUserId + ", userName=" + userName + ", password=" + password + "]";
	}
	public AdminUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
