package com.wikse.app.services.impl;

import com.wikse.app.bo.User;
import com.wikse.app.dao.UserDAO;
import com.wikse.app.dao.impl.UserDAOImpl;
import com.wikse.app.services.ServiceUser;


public class ServiceUserImpl implements ServiceUser {
	private UserDAO userDao;
	
	public ServiceUserImpl() {
		userDao= new UserDAOImpl();
	}
	
	@Override
	public User getUserById(int i) {
		return userDao.getUserById(i);
	}

	@Override
	public boolean updateUser(User userUpdate) {
		return userDao.updateUser(userUpdate);
	}

	@Override
	public boolean deleteUser(User userDelete) {
		return userDao.deleteUser(userDelete);
	}

	@Override
	public boolean addNewUser(User user) {
		return userDao.addNewUser(user);
	}

}
