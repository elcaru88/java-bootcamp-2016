package com.finalproject.service;

import com.finalproject.model.User;

public interface UserService {

	boolean login(User user);
	
	User createUser(String nickName, String password);

	User findByUserName(String userName);

	boolean existUserName(String userName);
	
	
}
