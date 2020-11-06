package com.bloodbank.dao;

import java.util.List;

import com.bloodbank.dto.BloodDonor;

public interface BloodDonorDao {
	void requestBlood(BloodDonor bloodDonor);
	List<BloodDonor> selectAll(int userId);
	void deleteDonor(int donarId);
	BloodDonor selectDonor(int donarId);
	void updateDonor(BloodDonor bloodDonor);
}
