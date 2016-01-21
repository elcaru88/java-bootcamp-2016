package com.wikse.app.dao.impl;

import java.util.List;

import com.wikse.app.bo.User;
import com.wikse.app.dao.UserDAO;
import com.wikse.app.helper.DataBaseHelper;

public class UserDAOImpl implements UserDAO {

	@Override
	public User getUserById(int id) {
		for (User user: DataBaseHelper.getListUsers()) {
			if (id == user.getIdUser()) {
				return user;
			}
		}
		return new User();
	}

	@Override
	public boolean updateUser(User userUpdate) {
		List<User> users=DataBaseHelper.getListUsers();
		for (int i = 0; i < users.size(); i++) {
			if (users.get(i).getIdUser() == userUpdate.getIdUser()) {
				users.set(i, userUpdate);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean deleteUser(User userDelete) {
		List<User> users=DataBaseHelper.getListUsers();
		for (int i = 0; i < users.size(); i++) {
			if (users.get(i).getIdUser() == userDelete.getIdUser()) {
				users.remove(i);
				DataBaseHelper.setListUsers(users);
				return true;
			}
		}
		
		return false;
	}

	@Override
	public boolean addNewUser(User user) {
		List<User> users=DataBaseHelper.getListUsers();
		users.add(user);
		DataBaseHelper.setListUsers(users);
		return true;
	}

}
