package com.dinesh.tatasky.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pack")
public class packModel {

	@Id
	@Column(name = "pack_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long packId;
	
	@Column(name = "pack_cost",columnDefinition = "float")
	private Double packCost;
	
	@Column(name = "days_validity",columnDefinition = "int")
	private int daysValidity;
	
	@Column(name = "description", columnDefinition = "varchar(200) default ''")
	private String description;
	
	@Column(name = "plan_name", columnDefinition = "varchar(200) default ''")
	private String planName;
	
//	private List<String> channels;
	public Long getPackId() {
		return packId;
	}
	public void setPackId(Long packId) {
		this.packId = packId;
	}
	public Double getPackCost() {
		return packCost;
	}
	public void setPackCost(Double packCost) {
		this.packCost = packCost;
	}
	public Integer getDaysValidity() {
		return daysValidity;
	}
	public void setDaysValidity(Integer daysValidity) {
		this.daysValidity = daysValidity;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
//	public List<String> getChannels() {
//		return channels;
//	}
//	public void setChannels(List<String> channels) {
//		this.channels = channels;
//	}
	
	
	
}
