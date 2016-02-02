package com.wikse.app.dao;

import java.util.List;

public interface GenericDAO <T,Id> {

	boolean add(T object);
	boolean delete(T objec);
	boolean update(T object);
	
	List<T> getAll();
	T getById(Id id);
}
