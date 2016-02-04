package com.finalproject.service;

import com.finalproject.model.User;

public interface UserService {

	public boolean login(User user);
	
	public User createUser(String nickName, String password);
	
	
}
