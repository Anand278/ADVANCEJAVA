package com.bloodbank.service;

import java.util.List;


import com.bloodbank.dto.BloodDonor;

public interface BloodDonorService {
	void addBlood(BloodDonor bloodDonor);
	List<BloodDonor> selectAll(int userId);
	void removeDonar(int donarId);
	BloodDonor findDonar(int donarId);
	void modifyDonar(BloodDonor bloodDonor);
}
