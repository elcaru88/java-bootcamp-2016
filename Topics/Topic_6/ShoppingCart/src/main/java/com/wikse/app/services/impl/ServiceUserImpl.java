package com.wikse.app.services.impl;

import org.springframework.stereotype.Service;

import com.wikse.app.bo.User;
import com.wikse.app.dao.UserDAO;
import com.wikse.app.dao.impl.UserDAOImpl;
import com.wikse.app.services.ServiceUser;

@Service
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
	public User updateUser(User userUpdate) {
		return userDao.updateUser(userUpdate);
	}

	@Override
	public User deleteUser(int idUser) {
		return userDao.deleteUser(idUser);
	}

	@Override
	public User addNewUser(User user) {
		return userDao.addNewUser(user);
	}

}
