package com.dinesh.tatasky.controller;

import java.time.LocalDate;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dinesh.tatasky.model.accountModel;
import com.dinesh.tatasky.model.packModel;
import com.dinesh.tatasky.model.rechargeModel;
import com.dinesh.tatasky.service.rechargeService;

@RestController
public class rechargeController {
	static final Logger LOGGER = LoggerFactory.getLogger(rechargeController.class);
	
@Autowired
rechargeService RechargeService;
	
	
	
	@GetMapping(value="/api/get_recharge_data/{id}")
	public rechargeModel getRechargeData(@PathVariable(value ="id") Double id) {
		LOGGER.info("/RechargeService/add URL is opened");
		LOGGER.info("get recharge method executed");
		return RechargeService.getRechargeData(id);
	}
	
	@PostMapping(value="/api/post_recharge_data")
	public rechargeModel createRecharge(@RequestBody packModel packmodel, @RequestBody accountModel accountmodel) {
		LOGGER.info("/PackService/add URL is opened");
		LOGGER.info("post recharge method executed");
		 return RechargeService.createRecharge(packmodel,accountmodel);
	}
	
	@PutMapping(value="/api/update_recharge_data")
	public rechargeModel updateRecharge(@RequestBody rechargeModel rechargemodel) {
		LOGGER.info("/RechargeService/add URL is opened");
		LOGGER.info("update recharge method executed");
		return RechargeService.updateRecharge(rechargemodel);
	}
	
	@GetMapping(value="/api/get_recharge_data_purchase_date_desc")
	public List<rechargeModel> findRechargeforUserinDescendingOrderbyPurchaseddate(@RequestBody accountModel accountmodel) {
		return RechargeService.findRechargeforUserinDescendingOrderbyPurchaseddate(accountmodel);
	}
	
	@GetMapping(value="/api/get_recharge_data_count")
	public Double rechargesforUsercount(@RequestBody accountModel accountmodel) {
		return RechargeService.rechargesforUsercount(accountmodel);
	}
	
	@GetMapping(value="/api/get_recharge_data_period")
	public List<rechargeModel> findAllRechargesinPeriod(@RequestParam LocalDate startDate,@RequestParam LocalDate endDate) {
		return RechargeService.findAllRechargesinPeriod(startDate, endDate);
	}
	
	@GetMapping(value="/api/get_recharge_data_period_count")
	public Double countRechargesinPeriod(@RequestParam LocalDate startDate,@RequestParam LocalDate endDate) {
		return RechargeService.countRechargesinPeriod(startDate, endDate);
	}
	
	@GetMapping(value="/api/get_recharge_data_total_revenue_period")
	public Double totalRevenueinPeriod(@RequestParam LocalDate startDate,@RequestParam LocalDate endDate) {
		return RechargeService.totalRevenueinPeriod(startDate, endDate);
	}
	
	@GetMapping(value="/api/get_recharge_count")
	public Double rechargesCount(@RequestBody packModel packmodel) {
		return RechargeService.rechargesCount(packmodel);
	}
	
	public rechargeModel rechargeExpireifValidityfinished(@RequestBody accountModel accountmodel,@RequestBody rechargeModel rechargemodel) {
		return RechargeService.rechargeExpireifValidityfinished(accountmodel,rechargemodel);
	}

}
