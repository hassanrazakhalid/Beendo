package com.Beendo.Dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;

import com.Beendo.Entities.Practise;
import com.Beendo.Entities.RoleAndPermission;
import com.Beendo.Entities.User;

public interface IRolesAndPermission {

	public void save(RoleAndPermission entity);
	
	public void update(RoleAndPermission entity);
	
//	public T findById(Id id);
	
	public void delete(RoleAndPermission entity);
	
	public void delete(int id);
	
	public List<RoleAndPermission> findAll();
	
	public void deleteAll();

}
