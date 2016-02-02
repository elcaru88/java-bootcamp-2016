package com.wikse.app.dao;

import com.wikse.app.bo.User;

/**
 * Manages all the data from database about the user.
 * @author Emanuel
 * @version 1.0
 * @since 2016-01-19
 */
public interface UserDAO {

	/**
	 * Returns a specific user, searched it by the identification.
	 * @param id of the user.
	 * @return a user object. if it has not been found, returns a user with the id = 0
	 */
	User getUserById(int id);

	/**
	 * Updates an existing user in database.
	 * @param userUpdate the existing user with the modification to save
	 * @return the user updated or a user with the old data
	 */
	User updateUser(User userUpdate);

	/**
	 * Deletes an existing user in database.
	 * @param The id of user will be deleted
	 * @return returns the user that has been removed or or if it fail, returns a user with id = 0
 	 */
	User deleteUser(int idUser);

	/**
	 * Adds a new user to database
	 * @param user the user will be added
	 * @return returns the user created or returns a user with id = 0
	 */
	User addNewUser(User user);

}
