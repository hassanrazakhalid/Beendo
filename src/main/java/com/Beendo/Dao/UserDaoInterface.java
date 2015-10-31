package com.Beendo.Dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;

import com.Beendo.Entities.User;

public interface UserDaoInterface {

	public void save(User entity);
	
	public void update(User entity);
	
//	public T findById(Id id);
	
	public void delete(User entity);
	
	public List<User> findAll();
	
	public void deleteAll();

	public User isUserValid(String email, String password);
}
