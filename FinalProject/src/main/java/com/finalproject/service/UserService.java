package com.finalproject.service;

import com.finalproject.model.User;

public interface UserService {

	public boolean login(User user);
	
	public User createUser(String nickName, String password);

	public User findByUserName(String userName);

	public boolean existUserName(String userName);
	
	
}
