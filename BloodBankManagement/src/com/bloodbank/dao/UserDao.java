package com.bloodbank.dao;

import com.bloodbank.dto.User;

public interface UserDao {
	void insertUser(User user);
	boolean checkUser(User user);
}
