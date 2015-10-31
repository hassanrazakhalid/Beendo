package com.Beendo.Dao;

import java.util.List;

import com.Beendo.Entities.Practise;
import com.Beendo.Entities.User;

public class PracticeDao extends RootDao {

	public void save(Practise entity) {
		// TODO Auto-generated method stub
		this.currentSession.save(entity);
	}

	public void update(Practise entity) {
		// TODO Auto-generated method stub
		
	}

	public Practise findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(Practise entity) {
		// TODO Auto-generated method stub
		
	}

	public List<Practise> findAll() {
		return this.currentSession.createQuery("FROM Practise").list();
	}

	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

}
