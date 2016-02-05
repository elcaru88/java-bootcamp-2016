package com.finalprojectV3.service;

import java.util.List;

import com.finalprojectV3.model.User;


public interface UserService {

	boolean addEntity(User user);

	User getEntity(int id);

	List<User> getEntities();

}
