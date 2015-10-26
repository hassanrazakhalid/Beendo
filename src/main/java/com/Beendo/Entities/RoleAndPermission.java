package com.Beendo.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Type;

@Entity
public class RoleAndPermission {

	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	
	@Type(type = "org.hibernate.type.NumericBooleanType")
	private Boolean create;
	
	@Type(type = "org.hibernate.type.NumericBooleanType")
	private Boolean read;
	
	@Type(type = "org.hibernate.type.NumericBooleanType")
	private Boolean update;
	
	@Type(type = "org.hibernate.type.NumericBooleanType")
	private Boolean delete;
	
	// relations
	@OneToOne
	private User user;
	
	//relation methods
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
		//------
	
 
	public Integer getId() {
		return id;
	}
	public Boolean getCreate() {
		return create;
	}
	public void setCreate(Boolean create) {
		this.create = create;
	}
	public Boolean getRead() {
		return read;
	}
	public void setRead(Boolean read) {
		this.read = read;
	}
	public Boolean getUpdate() {
		return update;
	}
	public void setUpdate(Boolean update) {
		this.update = update;
	}
	public Boolean getDelete() {
		return delete;
	}
	public void setDelete(Boolean delete) {
		this.delete = delete;
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
	
	
	
}
