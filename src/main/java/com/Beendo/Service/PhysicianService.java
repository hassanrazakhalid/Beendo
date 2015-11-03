package com.Beendo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Beendo.Dao.ICRUD;
import com.Beendo.Entities.Physician;
import com.Beendo.Entities.Practise;

@Service
public class PhysicianService {

	@Autowired
	private ICRUD physicianDao;
	
	public void Save(Physician entity)
	{
		physicianDao.save(entity);
	}
	 
	public List<Physician> GetAll()
	{
		List<Physician> list = physicianDao.findAll();
		return list;
	}

	public void Delete(int id)
	{
		physicianDao.delete(id);
	}
	
	public void Update(int id)
	{
		physicianDao.update(id);
	}
	
	public void Update(Physician entity)
	{
		physicianDao.update(entity);
	}
	
}
