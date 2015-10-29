package com.Beendo.Dao;

import java.util.List;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.Beendo.Entities.User;
import com.Beendo.HibernateUtils.HibernateUtil;

public class UserDao extends RootDao implements UserDaoInterface<User, String> {

	private Session currentSession;
	
	private Transaction currentTransaction;
	
	public void save(User entity) {
		// TODO Auto-generated method stub
		this.currentSession.save(entity);
	}

	public void update(User entity) {
		// TODO Auto-generated method stub
		
	}

	public User findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(User entity) {
		// TODO Auto-generated method stub
		
	}

	public List<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	public User isUserValid(String email, String password){
		
		User user = null;
	
		Query query = this.currentSession.createQuery("FROM User U where U.email = :email AND U.password = :password");
		query.setParameter("email", email);
		query.setParameter("password", password);
		
		List<User> result = query.list();
		if(!result.isEmpty())
			user = result.get(0);
		
		return user;
		
	}

	
	
//	public void openSession() {
//		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
//		this.currentSession = sessionFactory.openSession();
//	}
//
//	public void closeSession() {
//		
//		this.currentTransaction.commit();
//		this.currentSession.close();
//	}
//	public void openTransaction() {
//		this.currentTransaction =  this.currentSession.beginTransaction();
//	}
//
//	public Session getCurrentSession() {
//		return currentSession;
//	}
//
//	public Transaction getCurrentTransaction() {
//		return currentTransaction;
//	}
//	
}
