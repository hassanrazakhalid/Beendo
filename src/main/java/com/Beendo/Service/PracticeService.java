package com.Beendo.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Beendo.Dao.IPractice;
import com.Beendo.Entities.Practise;

@Service
public class PracticeService {

	@Autowired
	private IPractice practiceDao;
	
	public void Save(Practise entity)
	{
//		practiceDao.openSession();
//		practiceDao.openTransaction();
//		
		practiceDao.save(entity);
//		
//		practiceDao.closeSession();
	}
	 
	public List<Practise> GetAll()
	{
		List<Practise> list = practiceDao.findAll();
		return list;
	}
	
	public void Delete(int id)
	{
		practiceDao.delete(id);
	}
	
}
