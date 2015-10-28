package com.Beendo.Dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;

public interface UserDaoInterface<T,Id extends Serializable> {

	public void save(T entity);
	
	public void update(T entity);
	
	public T findById(Id id);
	
	public void delete(T entity);
	
	public List<T> findAll();
	
	public void deleteAll();
}
