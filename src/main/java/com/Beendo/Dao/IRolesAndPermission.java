package com.Beendo.Dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;

import com.Beendo.Entities.Practise;
import com.Beendo.Entities.RoleAndPermission;
import com.Beendo.Entities.User;

public interface IRolesAndPermission extends ICRUD<RoleAndPermission, Integer> {
	
	public void deleteById(int id);
	public RoleAndPermission getRoleById(int id);
}
