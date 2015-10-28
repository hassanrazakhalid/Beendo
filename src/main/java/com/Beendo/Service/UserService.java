package com.Beendo.Service;

import java.util.List;

import javax.persistence.Id;

import com.Beendo.Dao.UserDao;
import com.Beendo.Entities.User;

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
}
