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
	
//	public UserService(){
//		
////		userDao = new UserDao();	
//		roleAndPermissionDao = new RoleAndPermissionDao();
//	}
	
	public void save(User entity){
		
//		userDao.openSession();
//		userDao.openTransaction();
		
//		userDao.save(entity);
		
//		userDao.closeSession();
		
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
	
	@Transactional
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
