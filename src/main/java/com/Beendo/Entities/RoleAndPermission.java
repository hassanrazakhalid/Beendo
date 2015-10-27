package com.Beendo.Entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.annotations.Type;

@Entity
@Table (name = "ROLES_PERMISSION")
public class RoleAndPermission {

	@Id @GeneratedValue (generator = "New_Gen")// (strategy = GenerationType.AUTO)
	@GenericGenerator(name = "New_Gen", strategy = "foreign", parameters ={@Parameter(value = "user", name = "property")})
	private Integer user_id;
	
	private String type;
	
	@Column (name = "Create_Permission")
	private Boolean create;
	
	@Column (name = "Read_Permission")
	private Boolean read;
	
	@Column (name = "Update_Permission")
	private Boolean update;
	
	@Column (name = "Delete_Permission")
	private Boolean delete;
	
	// relations
	@OneToOne (cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id")
	private User user;
	
	//relation methods
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
		//------
	
 
	
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
	

	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	
	
	
}
