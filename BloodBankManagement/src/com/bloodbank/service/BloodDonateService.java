package com.bloodbank.service;

import java.util.List;

import com.bloodbank.dto.BloodDonate;


public interface BloodDonateService {
	void addDblood(BloodDonate bloodDonate);
	List<BloodDonate> selectDall(int userId);
	void removeDonate(int donateId);
	BloodDonate findDonate(int donateId);
	void modifyDonate(BloodDonate bloodDonate);
}
