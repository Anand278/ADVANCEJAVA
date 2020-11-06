package com.bloodbank.service;

import com.bloodbank.dto.User;

public interface UserService {
	void addUser(User user);
	boolean findUser(User user);
}
