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
	public User updateUser(User userUpdate) {
		List<User> users=DataBaseHelper.getListUsers();
		for (int i = 0; i < users.size(); i++) {
			if (users.get(i).getIdUser() == userUpdate.getIdUser()) {
				users.set(i, userUpdate);
				return userUpdate;
			}
		}
		return null;
	}

	@Override
	public User deleteUser(int idUser) {
		List<User> users=DataBaseHelper.getListUsers();
		for (int i = 0; i < users.size(); i++) {
			if (users.get(i).getIdUser() == idUser) {
				User userDeleted= users.get(idUser);
				users.remove(i);
				DataBaseHelper.setListUsers(users);
				return userDeleted;
			}
		}
		User userError= new User();
		userError.setIdUser(0);
		return userError;
	}

	@Override
	public User addNewUser(User user) {
		boolean repeatedUser=DataBaseHelper.checkUserByName(user.getNameUser());
		if (repeatedUser) {
			User notNew= new User();
			notNew.setIdUser(0);
			return notNew;
		}
		User newUser= DataBaseHelper.addUser(user);
		if (newUser == null) {
			User notNew= new User();
			notNew.setIdUser(0);
			return notNew;
		}
		return newUser;
	}

}
