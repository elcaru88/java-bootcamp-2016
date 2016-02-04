package com.finalproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finalproject.dao.UserDao;
import com.finalproject.model.User;

@Service
public class UserServiceImp implements UserService{

	@Autowired
	UserDao userdao;
	
	@Override
	public boolean login(User user) {

		User usertemp;
		
		boolean login = false;
		usertemp = userdao.findByNickName(user.getNickName());
		if (usertemp!= null && user.equals(usertemp)) {
			login = true;
		}
		return login;
	}
		
	
	@Override
	public User createUser(String nickName, String password) {
		
		User user = new User(nickName,password);
		return (userdao.saveAndFlush(user));
		
	}

	@Override
	public User findByUserName(String userName) {
		return userdao.findByNickName(userName);
	}
	
	@Override
	public boolean existUserName(String userName) {
		boolean exist = false;
		User user = userdao.findByNickName(userName);
		if (user!= null && user.equals(userName)) {
			exist = true;
		}
		return exist;
	}
	
}
