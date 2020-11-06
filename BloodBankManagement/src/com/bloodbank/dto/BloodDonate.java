package com.bloodbank.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class BloodDonate {
	@Id
	@GeneratedValue
	private int donateId;
	private String firstName;
	private String lastName;
	private String mobile;
	private String address;
	private String bloodGroup;
	private int userId;
	public BloodDonate() {
		
	}
	public int getDonateId() {
		return donateId;
	}
	public void setDonateId(int donateId) {
		this.donateId = donateId;
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
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public BloodDonate(int donateId) {
		this.donateId = donateId;
	}
	@Override
	public String toString() {
		return donateId + " " + firstName + " " + lastName + " "
				+ mobile + " " + address + " " + bloodGroup + " " + userId;
	}
	
}
