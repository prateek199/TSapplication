package com.dinesh.tatasky.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@Entity
@Table(name = "service_request")
@JsonIgnoreProperties("service_request")
public class servicerequestModel implements Serializable{
	
	
	private static final long serialVersionUID = 1L;


	@Id
	@Column(name = "serid")
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long serid;
	
	
	@Column(name = "requested_date")
	private LocalDate requestedDate;
	

	@ManyToOne(targetEntity=accountModel.class,fetch = FetchType.LAZY)
	@JoinColumn(name="account_id")  
	@JsonProperty("service_request") 
	private accountModel account;
	
	@Column(name = "message", columnDefinition = "varchar(200) default ''")
	private String message;
	
	@Column(name = "status_opened", columnDefinition = "int")
	private Boolean statusOpened;
	
	
	public Long getSid() {
		return serid;
	}
	public void setSid(Long serid) {
		this.serid = serid;
	}
	public LocalDate getRequestedDate() {
		return requestedDate;
	}
	public void setRequestedDate(LocalDate requestedDate) {
		this.requestedDate = requestedDate;
	}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Boolean getStatusOpened() {
		return statusOpened;
	}
	public void setStatusOpened(Boolean statusOpened) {
		this.statusOpened = statusOpened;
	}
	public accountModel getAccount() {
		return account;
	}
	public void setAccount(accountModel account) {
		this.account = account;
	}
	

}
