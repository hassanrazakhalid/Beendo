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

import com.Beendo.Entities.RoleAndPermission;
import com.Beendo.Entities.User;
import com.Beendo.HibernateUtils.HibernateUtil;

public class RoleAndPermissionDao extends RootDao implements UserDaoInterface<RoleAndPermission, String> {

	private Session currentSession;
	
	private Transaction currentTransaction;
	
	public void save(RoleAndPermission entity) {
		// TODO Auto-generated method stub
		this.currentSession.save(entity);
	}

	public void update(RoleAndPermission entity) {
		// TODO Auto-generated method stub
		
	}

	public RoleAndPermission findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(User entity) {
		// TODO Auto-generated method stub
		
	}

	public List<RoleAndPermission> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}
	public void delete(RoleAndPermission entity) {
		// TODO Auto-generated method stub
		
	}
	
}
