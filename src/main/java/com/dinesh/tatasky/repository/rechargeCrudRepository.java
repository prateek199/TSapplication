package com.dinesh.tatasky.repository;

import java.time.LocalDate;
import java.util.List;

import com.dinesh.tatasky.model.accountModel;
import com.dinesh.tatasky.model.packModel;
import com.dinesh.tatasky.model.rechargeModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


public interface rechargeCrudRepository extends CrudRepository<rechargeModel,Long>{

	
	@Query("select r from rechargeModel r where r.account = ?1 order by r.purchasedDate desc")
	List<rechargeModel> findRechargeforUserinDescendingOrderbyPurchaseddate(accountModel accountmodel);
	
	

	@Query("select count(*) from rechargeModel r where r.account = ?1 ")
	Double rechargesforUsercount(accountModel accountmodel);
	
	@Query("select r from rechargeModel r where r.purchasedDate between ?1 and ?2 ")
	List<rechargeModel> findAllRechargesinPeriod(LocalDate startDate,LocalDate endDate);
	
	@Query("select count(*) from rechargeModel r where r.purchasedDate between ?1 and ?2 ")
	Double countRechargesinPeriod(LocalDate startDate,LocalDate endDate);
	
	@Query("select sum(r.amount) from rechargeModel r where r.purchasedDate between ?1 and ?2 ")
	Double totalRevenueinPeriod(LocalDate startDate, LocalDate endDate);
	
	@Query("select count(*) from rechargeModel r where r.account.currentPack = ?1")
	Double rechargesCount(packModel packmodel);
	
	@Query(value="delete from account a join recharge r where a.account_id = ?1 and r.account_id = ?1 and r.rid= ?2 and r.purchange_date<(sysdate-r.days_validity)",nativeQuery = true)
	rechargeModel rechargeExpireifValidityfinished(accountModel accountmodel,rechargeModel rechargemodel);
}

