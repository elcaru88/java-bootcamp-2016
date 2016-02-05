package com.finalprojectV3.dao;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.finalprojectV3.model.User;

@Repository
public class UserDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Transactional
	public boolean addEntity(User entity) {
		this.sessionFactory.getCurrentSession().save(entity);
		return true;
	}

	@Transactional
	public User getEntity(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		User p = (User) session.get(User.class, new Integer(id));
		return p;
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public List<User> getEntities() {
		Session session = this.sessionFactory.getCurrentSession();
		List<User> personsList = session.createQuery("from User").list();
		return personsList;
	}

	@Transactional
	public boolean updateEntity(User entity) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(entity);
		return true;
	}

}
