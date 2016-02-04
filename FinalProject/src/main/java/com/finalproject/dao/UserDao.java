package com.finalproject.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.finalproject.model.User;

public interface UserDao extends JpaRepository<User, Long>{

	 User findByNickName(String nickName);

	
}
