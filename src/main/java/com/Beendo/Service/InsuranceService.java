package com.Beendo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Beendo.Dao.ICRUD;
import com.Beendo.Entities.Insurance;
import com.Beendo.Entities.Physician;

@Service
public class InsuranceService {

	@Autowired
	private ICRUD insuranceDao;
	
	public void Save(Insurance entity)
	{
		insuranceDao.save(entity);
	}
	 
	public List<Insurance> GetAll()
	{
		List<Insurance> list = insuranceDao.findAll();
		return list;
	}

	public void Delete(int id)
	{
		insuranceDao.delete(id);
	}
	
	public void Update(int id)
	{
		insuranceDao.update(id);
	}
	
	public void Update(Insurance entity)
	{
		insuranceDao.update(entity);
	}
	
}
