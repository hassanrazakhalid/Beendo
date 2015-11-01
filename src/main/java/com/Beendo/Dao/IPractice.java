package com.Beendo.Dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;

import com.Beendo.Entities.Practise;
import com.Beendo.Entities.User;

public interface IPractice {

	public void save(Practise entity);
	
	public void update(Practise entity);
	
//	public T findById(Id id);
	
	public void delete(Practise entity);
	
	public void delete(int id);
	
	public List<Practise> findAll();
	
	public void deleteAll();

}
