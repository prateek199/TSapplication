package com.dinesh.tatasky.model;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "account")
@JsonIgnoreProperties("account")
public class accountModel{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "account_id")
	private Long accountId;
	
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "account")
	private userModel user;
	
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "account")
	@LazyCollection(LazyCollectionOption.FALSE)
	@JsonIgnore
	private Set<rechargeModel> recharges;
	
	@Column(name = "registered_date")
	private LocalDate registeredDate;
	
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "account")
	@LazyCollection(LazyCollectionOption.FALSE)
	@JsonIgnore
	private Set<servicerequestModel> requests;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name="pack_id", referencedColumnName = "pack_id")
	@JsonIgnore
	private packModel currentPack;
	
	public Long getAccountId() {
		return accountId;
	}
	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}
	
	public packModel getCurrentPack() {
		return currentPack;
	}
	public void setCurrentPack(packModel currentPack) {
		this.currentPack = currentPack;
	}

	public LocalDate getRegisteredDate() {
		return registeredDate;
	}
	public void setRegisteredDate(LocalDate registeredDate) {
		this.registeredDate = registeredDate;
	}
	public userModel getUser() {
		return user;
	}
	public void setUser(userModel user) {
		this.user = user;
	}
	public Set<rechargeModel> getRecharges() {
		return recharges;
	}
	public void setRecharges(Set<rechargeModel> recharges) {
		this.recharges = recharges;
	}
	public Set<servicerequestModel> getRequests() {
		return requests;
	}
	public void setRequests(Set<servicerequestModel> requests) {
		this.requests = requests;
	}
	
}
