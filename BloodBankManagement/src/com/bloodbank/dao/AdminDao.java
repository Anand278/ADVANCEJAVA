package com.bloodbank.dao;

import com.bloodbank.dto.AdminUser;

public interface AdminDao {
	void insertUser(AdminUser adminUser);
	boolean checkUser(AdminUser adminUser);
}

