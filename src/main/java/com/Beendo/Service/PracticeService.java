package com.Beendo.Service;

import java.util.List;

import com.Beendo.Dao.PracticeDao;
import com.Beendo.Entities.Practise;

public class PracticeService {

	private static PracticeDao practiceDao;

	public PracticeService()
	{
		practiceDao = new PracticeDao();
	}
	
	public void Save(Practise entity)
	{
		practiceDao.openSession();
		practiceDao.openTransaction();
		
		practiceDao.save(entity);
		
		practiceDao.closeSession();
	}
	
	public List<Practise> GetAll()
	{
		practiceDao.openSession();
		practiceDao.openTransaction();
		
		List<Practise> list = practiceDao.findAll();
		
		practiceDao.closeSession();
		return list;
	}
	
}
