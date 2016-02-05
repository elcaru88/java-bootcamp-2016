package com.finalprojectV3.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finalprojectV3.dao.UserDAO;
import com.finalprojectV3.model.User;

@Service
public class UserServiceImp implements UserService {

	@Autowired
	UserDAO userDao;
		
	public User getEntity(int id) {
		User result = userDao.getEntity(id);
		return result;
	}
	
	public boolean addEntity(User user) {
		userDao.addEntity(user);
		return true;
	}

	public List<User> getEntities() {
		List<User> result = new ArrayList<User>();
		for (User user : userDao.getEntities()) {      //
			result.add(user);
		}
		return result;
	}

	

}
