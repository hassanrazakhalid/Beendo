package com.Beendo.Service;

import java.util.HashMap;
import java.util.List;

import javax.persistence.Id;

import org.hibernate.Query;
import org.hibernate.Session;

import com.Beendo.Constants.Constants;
import com.Beendo.Dao.RoleAndPermissionDao;
import com.Beendo.Dao.UserDao;
import com.Beendo.Dao.UserDaoInterface;
import com.Beendo.Entities.RoleAndPermission;
import com.Beendo.Entities.User;
import com.Beendo.HibernateUtils.HibernateUtil;

public class RoleAndPermissionService implements UserDaoInterface<RoleAndPermission, String> {

	private static RoleAndPermissionDao roleAndPermission;
	
	public RoleAndPermissionService(){
		
		roleAndPermission = new RoleAndPermissionDao();
		
	}

	public void save(RoleAndPermission entity) {
		// TODO Auto-generated method stub
		roleAndPermission.openSession();
		roleAndPermission.openTransaction();
		
		roleAndPermission.save(entity);
		
		roleAndPermission.closeSession();
	}

	public void update(RoleAndPermission entity) {
		// TODO Auto-generated method stub
		roleAndPermission.openSession();
		roleAndPermission.openTransaction();
		
		roleAndPermission.update(entity);
		
		roleAndPermission.closeSession();
	}

	public RoleAndPermission findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(RoleAndPermission entity) {
		// TODO Auto-generated method stub
		roleAndPermission.openSession();
		roleAndPermission.openTransaction();
		
		roleAndPermission.delete(entity);
		
		roleAndPermission.closeSession();
	}

	public List<RoleAndPermission> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}
	
	public static RoleAndPermission getObject(String type, HashMap<String, Boolean>hashMap){
		
		RoleAndPermission roleAndPermis = new RoleAndPermission();
		roleAndPermis.setType(type);
		roleAndPermis.setCreate(hashMap.get(Constants._kCreate));
		roleAndPermis.setRead(hashMap.get(Constants._kRead));
		roleAndPermis.setDelete(hashMap.get(Constants._kDelete));
		roleAndPermis.setUpdate(hashMap.get(Constants._kUpdate));
		
		return roleAndPermis;
		
	}

}
