package com.bloodbank.dao;

import java.util.List;

import com.bloodbank.dto.BloodDonate;

public interface BloodDonateDao {
	void donateBlood(BloodDonate bloodDonate);
	List<BloodDonate> selectDall(int userId);
	void deleteDonate(int donateId);
	BloodDonate selectDonate(int donateId);
	void updateDonate(BloodDonate bloodDonate);
}
