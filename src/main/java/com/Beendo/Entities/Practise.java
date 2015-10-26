package com.Beendo.Entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Practise {

	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	
	// relations
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	@OneToMany(mappedBy = "practise")
	private List<InsuranceDetail> insuranceDetail;

	//relation methods
	
	//------
	public Integer getId() {
		return id;
	}


	public List<InsuranceDetail> getInsuranceDetail() {
		return insuranceDetail;
	}


	public void setInsuranceDetail(List<InsuranceDetail> insuranceDetail) {
		this.insuranceDetail = insuranceDetail;
	}

	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}
	
	
}
