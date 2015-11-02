package com.Beendo.Dao;

import java.util.List;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Beendo.Entities.User;
import com.Beendo.HibernateUtils.HibernateUtil;


@Repository
public class UserDao implements UserDaoInterface {

	@Autowired
    private SessionFactory sessionFactory;

	@Transactional
	public User isUserValid(String email, String password){
		
		User user = null;
	
		Session session = this.sessionFactory.getCurrentSession();
		Query query = session.createQuery("FROM User U where U.email = :email AND U.password = :password");
		query.setParameter("email", email);
		query.setParameter("password", password);
		
		List<User> result = query.list();
		if(!result.isEmpty())
			user = result.get(0);
		
		return user;	
	}

	@Transactional
	public void save(User entity) {
		// TODO Auto-generated method stub
		this.sessionFactory.getCurrentSession().save(entity);
	}

	public void update(User entity) {
		// TODO Auto-generated method stub
		
	}

	public User findById(Integer id) {
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
}
