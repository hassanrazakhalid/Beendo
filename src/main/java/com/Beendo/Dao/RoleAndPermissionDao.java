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

import com.Beendo.Entities.Practise;
import com.Beendo.Entities.RoleAndPermission;
import com.Beendo.HibernateUtils.HibernateUtil;

@Repository
public class RoleAndPermissionDao implements IRolesAndPermission {

	@Autowired
	private SessionFactory sessionFactry;

	public void save(RoleAndPermission entity) {
		// TODO Auto-generated method stub
		this.sessionFactry.getCurrentSession().save(entity);
	}

	public void update(RoleAndPermission entity) {
		// TODO Auto-generated method stub
		this.sessionFactry.getCurrentSession().update(entity);
	}

	public void delete(RoleAndPermission entity) {
		// TODO Auto-generated method stub
		this.sessionFactry.getCurrentSession().delete(entity);
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	public List<RoleAndPermission> findAll() {
		// TODO Auto-generated method stub
		 return this.sessionFactry.getCurrentSession().createQuery("FROM RoleAndPermission").list();
	}

	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}
	

}
