package com.Beendo.Entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Comment {

	@Id
	@GeneratedValue
	private Integer id;
	private String detail;
	private Date date;
	
	// relations
	
	@ManyToOne
	@JoinColumn (name = "id", insertable = false, updatable = false)
	private InsuranceDetail insuranceDetail;
	
	//relation methods
	
	
		//------
	
	public Integer getId() {
		return id;
	}
	public InsuranceDetail getInsuranceDetail() {
		return insuranceDetail;
	}
	public void setInsuranceDetail(InsuranceDetail insuranceDetail) {
		this.insuranceDetail = insuranceDetail;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
	
}
