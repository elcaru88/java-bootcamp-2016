package com.wikse.app.services;

import com.wikse.app.bo.User;

/**
 * This class manages the implementation of the user.
 * @author Emanuel
 * @version 1.0
 * @since 2016-01-19
 */
public interface ServiceUser {


	/**
	 * Returns a specific user, searched by the identification.
	 * @param id of the user.
	 * @return a user object. if it has not been found, returns a user with the id = 0
	 */
	User getUserById(int idUser);

	/**
	 * Updates an existing user in database.
	 * @param userUpdate the existing user with the modification to save
	 * @return the user updated or a user with the id = 0
	 */
	User updateUser(User userUpdate);

	/**
	 * Deletes an existing user in database.
	 * @param the id of user will be deleted
	 * @return the user deleted or a user with the id = 0
 	 */
	User deleteUser(int idUser);

	/**
	 * Adds a new user to database
	 * @param user the user will be added
	 * @return the new user created or a user with the id = 0
	 */
	User addNewUser(User user);

}
