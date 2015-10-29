package com.Beendo.Service;

import java.util.List;

import javax.persistence.Id;

import org.hibernate.Query;
import org.hibernate.Session;

import com.Beendo.Dao.UserDao;
import com.Beendo.Entities.User;
import com.Beendo.HibernateUtils.HibernateUtil;

public class UserService {

	private static UserDao userDao;
	
	public UserService(){
		
		this.userDao = new UserDao();
		
	}
	
	public void save(User entity){
		
		this.userDao.openSession();
		this.userDao.openTransaction();
		
		this.userDao.save(entity);
		
		this.userDao.closeSession();
		
	}
	
	public void update(User entity){
		
		
	}
	
	public User findById(Id id){
		
		return null;
	}
	
	public void delete(User entity){
		
	}
	
	public List<User> findAll(){
		
		return null;
	}
	
	public void deleteAll(){
		
		
	}
	
	public User isUserValid(String email, String password){
		
		userDao.openSession();
		userDao.openTransaction();
		
		User user =	userDao.isUserValid(email, password);
		userDao.closeSession();
		
		return user;
		
	}
}
