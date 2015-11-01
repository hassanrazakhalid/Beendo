package com.Beendo.Dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Beendo.Entities.Practise;
import com.Beendo.Entities.User;

@Repository
public class PracticeDao implements IPractice {

	
	@Autowired
    private SessionFactory sessionFactory;
	
	@Transactional
	public void save(Practise entity) {
		
		sessionFactory.getCurrentSession().save(entity);
	}

	@Transactional
	public void update(Practise entity) {
		sessionFactory.getCurrentSession().update(entity);
		
	}
	
	@Transactional
	public void update(int id) {
		Practise tmp = (Practise) sessionFactory.getCurrentSession().load(Practise.class, id);
		sessionFactory.getCurrentSession().update(tmp);	
		
	}

	public void delete(Practise entity) {
		// TODO Auto-generated method stub
		
	}

	
	@Transactional
	public void delete(int id) {
		
		Practise tmp = (Practise) sessionFactory.getCurrentSession().load(Practise.class, id);
		sessionFactory.getCurrentSession().delete(tmp);		
	}

	@Transactional
	public List<Practise> findAll() {
		return sessionFactory.getCurrentSession().createQuery("From Practise").list();
	}

	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}



	

}
