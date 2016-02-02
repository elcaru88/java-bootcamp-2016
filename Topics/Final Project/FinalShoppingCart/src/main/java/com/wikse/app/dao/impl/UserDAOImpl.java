package com.wikse.app.dao.impl;

import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.wikse.app.dao.UserDAO;
import com.wikse.app.entities.Cart;
import com.wikse.app.entities.User;

@Repository
public class UserDAOImpl extends GenericDAOImpl<User, Integer> implements UserDAO {

	@Override
	@Transactional
	public String validate(String name, String password) {
		@SuppressWarnings("unchecked")
		TypedQuery<User> query= (TypedQuery<User>) getManager().createQuery("SELECT u FROM User u WHERE u.nameUser= :name AND u.password= :pass");
		query.setParameter("name", name);
		query.setParameter("pass", password);
		User u=query.getSingleResult();
		String pasValidated="validated"+u.getPassword();
		return pasValidated;
	}

	

	

}
