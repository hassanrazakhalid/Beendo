package com.Beendo.Dao;

import java.util.HashMap;
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

import com.Beendo.Entities.Practise;
import com.Beendo.Entities.RoleAndPermission;
import com.Beendo.Entities.User;
import com.Beendo.HibernateUtils.HibernateUtil;

@Repository
public class RoleAndPermissionDao implements IRolesAndPermission {

	@Autowired
	private SessionFactory sessionFactory;

	@Transactional
	public List<RoleAndPermission> findAll() {
		// TODO Auto-generated method stub
		 return this.sessionFactory.getCurrentSession().createQuery("FROM RoleAndPermission").list();
	}
	
	@Transactional
	public void deleteById(int id) {
		
		RoleAndPermission tmp = (RoleAndPermission) sessionFactory.getCurrentSession().load(RoleAndPermission.class, id);
		sessionFactory.getCurrentSession().delete(tmp);		
	}


	@Transactional
	public RoleAndPermission getRoleById(int id) {
		// TODO Auto-generated method stub
		RoleAndPermission role = null;
		Query query = sessionFactory.getCurrentSession().createQuery("FROM RoleAndPermission r where r.role_Id = :id ");
		query.setParameter("id", id);
		
		List<RoleAndPermission> result = query.list();
		if(!result.isEmpty())
			role = result.get(0);
		
		return role; 
	}

	@Transactional
	public void save(RoleAndPermission entity) {
		// TODO Auto-generated method stub
		this.sessionFactory.getCurrentSession().save(entity);
	}

	@Transactional
	public void update(RoleAndPermission entity) {
		// TODO Auto-generated method stub
		this.sessionFactory.getCurrentSession().update(entity);
	}

	public RoleAndPermission findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public void delete(RoleAndPermission entity) {
		// TODO Auto-generated method stub
		this.sessionFactory.getCurrentSession().delete(entity);
	}

	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}
}
