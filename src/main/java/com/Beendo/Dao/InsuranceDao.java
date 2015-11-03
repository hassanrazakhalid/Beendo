package com.Beendo.Dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.Beendo.Entities.Insurance;
import com.Beendo.Entities.Physician;

@Repository
public class InsuranceDao implements ICRUD<Insurance, Integer> {

	@Autowired
    private SessionFactory sessionFactory;
	
	@Transactional
	public void save(Insurance entity) {
		sessionFactory.getCurrentSession().save(entity);
		
	}

	@Transactional
	public void update(Insurance entity) {
		sessionFactory.getCurrentSession().update(entity);
		
	}

	@Transactional
	public void update(int id) {
		Insurance tmp = (Insurance) sessionFactory.getCurrentSession().load(Insurance.class, id);
		sessionFactory.getCurrentSession().update(tmp);	
		
	}

	public Insurance findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(Insurance entity) {
		// TODO Auto-generated method stub
		
	}

	@Transactional
	public void delete(int id) {
		Insurance tmp = (Insurance) sessionFactory.getCurrentSession().load(Insurance.class, id);
		sessionFactory.getCurrentSession().delete(tmp);	
		
	}

	@Transactional
	public List<Insurance> findAll() {
		return sessionFactory.getCurrentSession().createQuery("From Insurance").list();
	}

	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

}
