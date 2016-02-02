package com.wikse.app.dao;

import com.wikse.app.entities.Cart;
import com.wikse.app.entities.User;

/**
 * Manages all the data from database about the user.
 * @author Emanuel
 * @version 1.0
 * @since 2016-01-19
 */
public interface UserDAO extends GenericDAO<User, Integer> {

	String validate(String name, String password);


//	/**
//	 * Returns a specific user, searched by the identification.
//	 * @param id of the user.
//	 * @return a user object. if it has not been found, returns a user with the id = 0
//	 */
//	User getUserById(int id);
//
//	/**
//	 * Updates an existing user in database.
//	 * @param userUpdate the existing user with the modification to save
//	 * @return true if the update was completed. false if not
//	 */
//	boolean updateUser(User userUpdate);
//
//	/**
//	 * Deletes an existing user in database.
//	 * @param userDelete the user will be deleted
//	 * @return true if it has been deleted, false if not
// 	 */
//	boolean deleteUser(User userDelete);
//
//	/**
//	 * Adds a new user to database
//	 * @param user the user will be added
//	 * @return true if was added successfully, false if not
//	 */
//	boolean addNewUser(User user);
	
	
}
