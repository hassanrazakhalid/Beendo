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
		
		List<RoleAndPermission>result = null;
		
		roleAndPermission.openSession();
		roleAndPermission.openTransaction();
		
		result = roleAndPermission.findAll();
		
		roleAndPermission.closeSession();
		
		return result;
	}

	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}
	
	public static RoleAndPermission getObject(HashMap<String, String>hashMap){
		
		RoleAndPermission roleAndPermis = new RoleAndPermission();
		
		String createValue = hashMap.get(Constants._kCreate);
		String deleteValue = hashMap.get(Constants._kDelete);
		String updateValue = hashMap.get(Constants._kUpdate);
		
		try {
			roleAndPermis.setType(hashMap.get(Constants._kROLE_TYPE));
			
			roleAndPermis.setCreate(Boolean.valueOf(createValue));
			roleAndPermis.setRead(true);
			roleAndPermis.setDelete(Boolean.valueOf(deleteValue));
			roleAndPermis.setUpdate(Boolean.valueOf(updateValue));			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			
		}
		return roleAndPermis;
	}

}
