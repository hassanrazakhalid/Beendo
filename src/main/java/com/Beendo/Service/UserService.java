package com.Beendo.Service;

import java.util.List;

import javax.persistence.Id;

import org.hibernate.Query;
import org.hibernate.Session;

import com.Beendo.Dao.*;
import com.Beendo.Entities.*;
import com.Beendo.HibernateUtils.HibernateUtil;

public class UserService {

	private static UserDao userDao;
	private static RoleAndPermissionDao roleAndPermissionDao;
	
	public UserService(){
		
		userDao = new UserDao();	
		roleAndPermissionDao = new RoleAndPermissionDao();
	}
	
	public void save(User entity){
		
		userDao.openSession();
		userDao.openTransaction();
		
		userDao.save(entity);
		
		userDao.closeSession();
		
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
	
	public static User isUserValid(String email, String password){
		
		userDao.openSession();
		userDao.openTransaction();
		User user =	userDao.isUserValid(email, password);
		userDao.closeSession();
		return user;
	}
	
	public void setUserRoleAndPermis(RoleAndPermission sender, User user){
		
		userDao.openSession();
		userDao.openTransaction();
		
		user.setRoleAndPermission(sender);
		
		userDao.closeSession();
		
	}
}
