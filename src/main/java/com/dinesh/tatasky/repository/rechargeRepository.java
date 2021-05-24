package com.dinesh.tatasky.repository;

import java.time.LocalDate;
import java.util.List;

import com.dinesh.tatasky.model.accountModel;
import com.dinesh.tatasky.model.packModel;
import com.dinesh.tatasky.model.rechargeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



@Repository
public class rechargeRepository {

	
	@Autowired
	rechargeCrudRepository rechargecrudrepository;
	
	@Autowired
	accountCrudRepository accountcrudrepository;
	
	public rechargeModel getRechargeData(Long id) {
		
		rechargeModel rechargemodel=rechargecrudrepository.findById(id).get();
		return rechargemodel;
	}

	public rechargeModel createRecharge(packModel packmodel, accountModel accountmodel) {
		
		return accountcrudrepository.save(accountmodel).getRecharges().iterator().next();
	}

	public rechargeModel updateRecharge(rechargeModel rechargemodel) {
		
		return rechargecrudrepository.save(rechargemodel);
	}

	public List<rechargeModel> findRechargeforUserinDescendingOrderbyPurchaseddate(accountModel accountmodel) {
	
		return rechargecrudrepository.findRechargeforUserinDescendingOrderbyPurchaseddate(accountmodel);
	}

	public Double rechargesforUsercount(accountModel accountmodel) {
		
		
		return rechargecrudrepository.rechargesforUsercount(accountmodel);
	}

	public static rechargeModel rechargesforUsercount(LocalDate startDate, LocalDate endDate) {
		
		return null;
	}

	public List<rechargeModel> findAllRechargesinPeriod(LocalDate startDate, LocalDate endDate) {
		
		return rechargecrudrepository.findAllRechargesinPeriod(startDate,endDate);
	}

	public Double countRechargesinPeriod(LocalDate startDate, LocalDate endDate) {
		
		return rechargecrudrepository.countRechargesinPeriod(startDate,endDate);
	}

	public Double totalRevenueinPeriod(LocalDate startDate, LocalDate endDate) {
		
		return rechargecrudrepository.totalRevenueinPeriod(startDate,endDate);
	}

	public Double  rechargesCount(packModel packmodel) {
		
		return rechargecrudrepository.rechargesCount(packmodel);
	}

	public rechargeModel rechargeExpireifValidityfinished(accountModel accountmodel,rechargeModel rechargemodel) {
	
		return rechargecrudrepository.rechargeExpireifValidityfinished(accountmodel, rechargemodel);
	}

}
