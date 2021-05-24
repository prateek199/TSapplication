package com.dinesh.tatasky.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dinesh.tatasky.model.accountModel;
import com.dinesh.tatasky.model.packModel;
import com.dinesh.tatasky.model.rechargeModel;
import com.dinesh.tatasky.repository.rechargeRepository;


@Service
public class rechargeService {

	
	@Autowired
	rechargeRepository rechargerepository;
	
	public rechargeModel getRechargeData(Long id) {
		return rechargerepository.getRechargeData(id);
	}
	
	public rechargeModel createRecharge(packModel packmodel,accountModel accountmodel) {
		return rechargerepository.createRecharge(packmodel,accountmodel);
	}
	
	public rechargeModel updateRecharge(rechargeModel rechargemodel) {
		return rechargerepository.updateRecharge(rechargemodel);
	}
	
	public List<rechargeModel> findRechargeforUserinDescendingOrderbyPurchaseddate(accountModel accountmodel) {
		return rechargerepository.findRechargeforUserinDescendingOrderbyPurchaseddate(accountmodel);
	}
	
	public Double rechargesforUsercount(accountModel accountmodel) {
		return rechargerepository.rechargesforUsercount(accountmodel);
	}
	
	public List<rechargeModel> findAllRechargesinPeriod(LocalDate startDate, LocalDate endDate) {
		return rechargerepository.findAllRechargesinPeriod(startDate, endDate);
	}
	
	public Double countRechargesinPeriod(LocalDate startDate, LocalDate endDate) {
		return rechargerepository.countRechargesinPeriod(startDate, endDate);
	}
	
	public Double totalRevenueinPeriod(LocalDate startDate, LocalDate endDate) {
		return rechargerepository.totalRevenueinPeriod(startDate, endDate);
	}
	
	public Double rechargesCount(packModel packmodel) {
		return rechargerepository.rechargesCount(packmodel);
	}
	
	public rechargeModel rechargeExpireifValidityfinished(accountModel accountmodel,rechargeModel rechargemodel) {
		return rechargerepository.rechargeExpireifValidityfinished(accountmodel,rechargemodel);
	}

	public rechargeModel getRechargeData(Double id) {
		
		return null;
	}
	
}
