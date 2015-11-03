package com.Beendo.Dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.Beendo.Entities.Physician;
import com.Beendo.Entities.Practise;

@Repository
public class PhysicianDao implements ICRUD<Physician, Integer> {

	
	@Autowired
    private SessionFactory sessionFactory;
	
	@Transactional
	public void save(Physician entity) {
		sessionFactory.getCurrentSession().save(entity);
		
	}

	@Transactional
	public void update(Physician entity) {
		sessionFactory.getCurrentSession().update(entity);
		
	}

	@Transactional
	public void update(int id) {
		Physician tmp = (Physician) sessionFactory.getCurrentSession().load(Physician.class, id);
		sessionFactory.getCurrentSession().update(tmp);	
		
	}

	public Physician findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(Physician entity) {
		// TODO Auto-generated method stub
		
	}

	@Transactional
	public void delete(int id) {
		Physician tmp = (Physician) sessionFactory.getCurrentSession().load(Physician.class, id);
		sessionFactory.getCurrentSession().delete(tmp);	
		
	}

	@Transactional
	public List<Physician> findAll() {
		return sessionFactory.getCurrentSession().createQuery("From Physician").list();
	}

	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

}
