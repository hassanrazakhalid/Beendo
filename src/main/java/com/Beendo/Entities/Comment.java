package com.Beendo.Entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "COMMENTS_INSURANCE")
public class Comment {

	@Id
	@GeneratedValue
	private Integer commend_Id;
	private String detail;
	private Date date;
	
	// relations
	
	@ManyToOne
	private InsuranceDetail insuranceDetail;
	
	//relation methods
	
	
		//------
	

	public InsuranceDetail getInsuranceDetail() {
		return insuranceDetail;
	}
	public Integer getCommend_Id() {
		return commend_Id;
	}
	public void setCommend_Id(Integer commend_Id) {
		this.commend_Id = commend_Id;
	}
	public void setInsuranceDetail(InsuranceDetail insuranceDetail) {
		this.insuranceDetail = insuranceDetail;
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
