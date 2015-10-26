package com.Beendo.Entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "USERS")
public class User {

	@Id
	@GeneratedValue
	private Integer user_id;
	
	@Column(name = "Name")
	private String name;
	
	@Column(name = "Email")
	private String email;
	
	@Column(name = "Password")
	private String password;
	
	//relations
	@OneToOne (cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id", nullable = true)
	private	RoleAndPermission roleAndPermission;
	
//	@OneToMany(mappedBy = "user")
//	private List<Practise> practiseList; 
	
	//relations methods
	
	
	//---
	
	public RoleAndPermission getRole() {
		return roleAndPermission;
	}
	public void setRole(RoleAndPermission role) {
		this.roleAndPermission = role;
	}
//	public List<Practise> getPractiseList() {
//		return practiseList;
//	}
//	public void setPractiseList(List<Practise> practiseList) {
//		this.practiseList = practiseList;
//	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public RoleAndPermission getRoleAndPermission() {
		return roleAndPermission;
	}
	public void setRoleAndPermission(RoleAndPermission roleAndPermission) {
		this.roleAndPermission = roleAndPermission;
	}
	
	
}