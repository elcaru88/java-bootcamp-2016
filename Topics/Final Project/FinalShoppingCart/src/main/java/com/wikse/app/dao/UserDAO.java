package com.wikse.app.dao;

import com.wikse.app.entities.User;

/**
 * Manages all the data from database about the user.
 * @author Emanuel
 * @version 1.0
 * @since 2016-01-19
 */
public interface UserDAO extends GenericDAO<User, Integer> {

	String validate(String name, String password);
	
}
