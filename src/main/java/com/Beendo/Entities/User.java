package com.Beendo.Entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "USERS")
public class User {

	@Id
	@GeneratedValue
	@Column(name = "Persion_Id")
	private Integer id;
	
	@Column(name = "Name")
	private String name;
	
	@Column(name = "Email")
	private String email;
	
	@Column(name = "Password")
	private String password;
	
	//relations
	@OneToOne(mappedBy = "user",cascade = CascadeType.ALL, optional = true, fetch = FetchType.EAGER, orphanRemoval = true)
	private	RoleAndPermission roleAndPermission;
	
	@OneToMany(mappedBy = "user")
	private List<Practise> practiseList; 
	
	//relations methods
	
	
	//---
	
	public Integer getId() {
		return id;
	}
	public RoleAndPermission getRole() {
		return roleAndPermission;
	}
	public void setRole(RoleAndPermission role) {
		this.roleAndPermission = role;
	}
	public List<Practise> getPractiseList() {
		return practiseList;
	}
	public void setPractiseList(List<Practise> practiseList) {
		this.practiseList = practiseList;
	}
	public void setId(Integer id) {
		this.id = id;
	}
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
}