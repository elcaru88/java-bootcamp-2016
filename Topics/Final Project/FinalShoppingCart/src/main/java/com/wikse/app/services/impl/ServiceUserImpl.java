package com.wikse.app.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wikse.app.dao.UserDAO;
import com.wikse.app.entities.User;
import com.wikse.app.services.ServiceUser;

@Service
public class ServiceUserImpl implements ServiceUser {
	
	@Autowired
	private UserDAO userDao;

	@Override
	public User getUserById(Integer id) {
		return userDao.getById(id);
	}

	@Override
	public boolean updateUser(User userUpdate) {
		return userDao.update(userUpdate);
	}

	@Override
	public boolean deleteUser(User userDelete) {
		return userDao.delete(userDelete);
	}

	@Override
	public boolean addNewUser(User user) {
		return userDao.add(user);
	}

	@Override
	public String validateUser(String name, String password) {
		return userDao.validate(name,password);
	}
	
	
}
