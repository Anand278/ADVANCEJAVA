package com.bloodbank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bloodbank.dao.AdminDao;
import com.bloodbank.dto.AdminUser;


@Service
public class AdminServiceImple implements AdminService {
	
	@Autowired
	private AdminDao adminDao;
	
	@Override
	public void addUser(AdminUser adminUser) {
		adminDao.insertUser(adminUser);
		
	}

	@Override
	public boolean findUser(AdminUser adminUser) {
		return adminDao.checkUser(adminUser);
		
	}

}
