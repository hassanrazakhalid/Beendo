package com.Beendo.Service;

import java.util.List;

import javax.persistence.Id;
import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.Beendo.Dao.*;
import com.Beendo.Entities.*;
import com.Beendo.HibernateUtils.HibernateUtil;


@Service
public class UserService {

	@Autowired
//	@Qualifier("UserDao")
	private UserDaoInterface userDao;
//	private UserDao userDao;
//	private static RoleAndPermissionDao roleAndPermissionDao;
	
	public UserService(){

		System.out.println("");

	}
	
	public void save(User entity){
		
		userDao.save(entity);
		
	}
	
	public void update(User entity){
		
		userDao.update(entity);
	}
	
	public User findById(Id id){
		
		return null;
	}
	
	public void delete(User entity){
		
	}
	
	public void delete(int id){
		userDao.delete(id);
	}
	
	public List<User> findAll(){
		
		List<User> list = userDao.findAll();
		return list;
	}
	
	public void deleteAll(){
		
		
	}
	
	public User isUserValid(String email, String password){
		
//		System.out.println("Testing");
//		userDao.openSession();
//		userDao.openTransaction();
		User user =	userDao.isUserValid(email, password);
//		userDao.closeSession();
		return user;
	}
	
	public void setUserRoleAndPermis(RoleAndPermission sender, User user){
		
//		userDao.openSession();
//		userDao.openTransaction();
		
		user.setRoleAndPermission(sender);
		
//		userDao.closeSession();
		
	}

	public User findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
}
