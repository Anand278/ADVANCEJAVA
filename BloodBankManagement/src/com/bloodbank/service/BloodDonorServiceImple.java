package com.bloodbank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bloodbank.dao.BloodDonorDao;
import com.bloodbank.dto.BloodDonor;

@Service
public class BloodDonorServiceImple implements BloodDonorService{
	
	@Autowired
	private BloodDonorDao bloodDonorDao;

	@Override
	public void addBlood(BloodDonor bloodDonor) {
		bloodDonorDao.requestBlood(bloodDonor);
	}

	@Override
	public List<BloodDonor> selectAll(int userId) {
		return bloodDonorDao.selectAll(userId);
	}

	@Override
	public void removeDonar(int donarId) {
		bloodDonorDao.deleteDonor(donarId);
	}

	@Override
	public BloodDonor findDonar(int donarId) {
		return bloodDonorDao.selectDonor(donarId);
	}

	@Override
	public void modifyDonar(BloodDonor bloodDonor) {
		bloodDonorDao.updateDonor(bloodDonor);
	}


}
