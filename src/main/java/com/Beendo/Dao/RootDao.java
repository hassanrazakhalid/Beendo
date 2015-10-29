package com.Beendo.Dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.Beendo.HibernateUtils.HibernateUtil;

public class RootDao {

	private Session currentSession;
	
	private Transaction currentTransaction;
		
	public void openSession() {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		this.currentSession = sessionFactory.openSession();
	}

	public void closeSession() {
		
		this.currentTransaction.commit();
		this.currentSession.close();
	}
	public void openTransaction() {
		this.currentTransaction =  this.currentSession.beginTransaction();
	}

	public Session getCurrentSession() {
		return currentSession;
	}

	public Transaction getCurrentTransaction() {
		return currentTransaction;
	}
	
}
