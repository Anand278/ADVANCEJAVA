package com.bloodbank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bloodbank.dao.BloodDonateDao;
import com.bloodbank.dto.BloodDonate;

@Service
public class BloodDonateServiceImple implements BloodDonateService{

	@Autowired
	private BloodDonateDao bloodDonateDao;
	
	@Override
	public void addDblood(BloodDonate bloodDonate) {
		bloodDonateDao.donateBlood(bloodDonate);
	}

	@Override
	public List<BloodDonate> selectDall(int userId) {
		return bloodDonateDao.selectDall(userId);
	}

	@Override
	public void removeDonate(int donateId) {
		bloodDonateDao.deleteDonate(donateId);
	}

	@Override
	public void modifyDonate(BloodDonate bloodDonate) {
		bloodDonateDao.updateDonate(bloodDonate);
	}

	@Override
	public BloodDonate findDonate(int donateId) {
		return bloodDonateDao.selectDonate(donateId);
	}
	
	

}
