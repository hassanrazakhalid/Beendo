package com.Beendo.Entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class InsuranceDetail {

	@Id
	@GeneratedValue
	private Integer id;
	private String provider;
	private String insuranceName;
	private String status;
	private Date applicationFiledData;
	private Date effectiveDate;
	private Date letterRecivedDate;
	private Date lastContactDate;
	
	// relations
	
	@ManyToOne
	@JoinColumn(name = "id" , insertable = false, updatable = false)
	private Practise practise;
	
	@OneToMany (mappedBy = "insuranceDetail")
	private List<Comment> comments;
	
	//relation methods
	
		//------
	
	public Integer getId() {
		return id;
	}
	public Practise getPractise() {
		return practise;
	}
	public void setPractise(Practise practise) {
		this.practise = practise;
	}
	public List<Comment> getComments() {
		return comments;
	}
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getProvider() {
		return provider;
	}
	public void setProvider(String provider) {
		this.provider = provider;
	}
	public String getInsuranceName() {
		return insuranceName;
	}
	public void setInsuranceName(String insuranceName) {
		this.insuranceName = insuranceName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getApplicationFiledData() {
		return applicationFiledData;
	}
	public void setApplicationFiledData(Date applicationFiledData) {
		this.applicationFiledData = applicationFiledData;
	}
	public Date getEffectiveDate() {
		return effectiveDate;
	}
	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}
	public Date getLetterRecivedDate() {
		return letterRecivedDate;
	}
	public void setLetterRecivedDate(Date letterRecivedDate) {
		this.letterRecivedDate = letterRecivedDate;
	}
	public Date getLastContactDate() {
		return lastContactDate;
	}
	public void setLastContactDate(Date lastContactDate) {
		this.lastContactDate = lastContactDate;
	}
	
	
	
	
}
