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
@Table(name = "recharge")
@JsonIgnoreProperties("recharge")
public class rechargeModel implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "rid")
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long rid;
	
	@ManyToOne(targetEntity=accountModel.class,fetch = FetchType.LAZY)
	@JoinColumn(name="account_id") 
	@JsonProperty("recharge") 
	private accountModel account;
	
	@Column(name = "amount", columnDefinition = "float")
	private Double amount;
	
	@Column(name = "days_validity",columnDefinition = "int")
	private int daysValidity;
	
	@Column(name = "plan_description", columnDefinition = "varchar(200) default ''")
	private String planDescription;
	
	@Column(name = "plan_name", columnDefinition = "varchar(200) default ''")
	private String planName;
	
	@Column(name = "purchased_date")
	private LocalDate purchasedDate;
	
	
	private Long channelId;
	
//	private List<String> channels;
	
	public Long getRid() {
		return rid;
	}
	public void setRid(Long rid) {
		this.rid = rid;
	}
	
	public Long getChannelId() {
		return channelId;
	}
	public void setChannelId(Long channelId) {
		this.channelId = channelId;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public Integer getDaysValidity() {
		return daysValidity;
	}
	public void setDaysValidity(Integer daysValidity) {
		this.daysValidity = daysValidity;
	}
	public String getPlanDescription() {
		return planDescription;
	}
	public void setPlanDescription(String planDescription) {
		this.planDescription = planDescription;
	}
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public LocalDate getPurchasedDate() {
		return purchasedDate;
	}
	public void setPurchasedDate(LocalDate purchasedDate) {
		this.purchasedDate = purchasedDate;
	}
//	public List<String> getChannels() {
//		return channels;
//	}
//	public void setChannels(List<String> channels) {
//		this.channels = channels;
//	}
//	
	public accountModel getAccount() {
		return account;
	}
	public void setAccount(accountModel account) {
		this.account = account;
	}
	public void setDaysValidity(int daysValidity) {
		this.daysValidity = daysValidity;
	}
	

}
