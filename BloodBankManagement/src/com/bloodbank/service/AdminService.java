package com.bloodbank.service;

import com.bloodbank.dto.AdminUser;

public interface AdminService {
	void addUser(AdminUser adminUser);
	boolean findUser(AdminUser adminUser);
}
