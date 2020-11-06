package com.bloodbank.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class BloodDonor {
	@Id
	@GeneratedValue
	private int donarId;
	private String firstName;
	private String lastName;
	private String mobile;
	private String address;
	private String bloodGroup;
	private int userId;
	public BloodDonor() {
		
	}
	public int getDonarId() {
		return donarId;
	}
	public void setDonarId(int donarId) {
		this.donarId = donarId;
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
	public BloodDonor(int donarId) {
		this.donarId = donarId;
	}
	@Override
	public String toString() {
		return donarId + " " + firstName + " " + lastName + " "
				+ mobile + " " + address + " " + bloodGroup + " " + userId;
	}
	
}
