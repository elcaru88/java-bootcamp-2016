package com.wikse.app.dao.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.wikse.app.dao.GenericDAO;

public abstract class GenericDAOImpl  <T, Id extends Serializable> implements GenericDAO<T, Id>{

	private Class <T> persistenceClass;
	@PersistenceContext
	protected EntityManager manager;
	
	@SuppressWarnings("unchecked")
	public GenericDAOImpl() {
		this.persistenceClass= (Class<T>)((ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}

	public T getById(Id id) {
		return getManager().find(persistenceClass,id);
	}

	@SuppressWarnings("unchecked")
	@Transactional(readOnly=true)
	public List<T> getAll() {
		List<T> listaDeDatos=null;
		TypedQuery<T> consulta=(TypedQuery<T>) manager.createQuery("SELECT o FROM "+persistenceClass.getSimpleName()+" o");
		listaDeDatos=consulta.getResultList();
		return listaDeDatos;
	}
	
	@Transactional(propagation=Propagation.REQUIRED)
	public boolean update(T object) {
		T t=getManager().merge(object);
		if (t!=null) {
			return true;
		}
		return false;
	}

	@Transactional  //(propagation=Propagation.REQUIRED, rollbackFor=Exception.class)
	public boolean delete(T object) {
		getManager().remove(getManager().merge(object));
		return true;
	}
	
	@Transactional
	public boolean add(T object) {
		getManager().persist(object);
		return true;
	}

	public EntityManager getManager() {
		return manager;
	}

	public void setManager(EntityManager manager) {
		this.manager = manager;
	}


}
