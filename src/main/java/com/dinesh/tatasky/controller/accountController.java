package com.dinesh.tatasky.controller;

import java.time.LocalDate;

import com.dinesh.tatasky.model.accountModel;
import com.dinesh.tatasky.model.packModel;
import com.dinesh.tatasky.service.accountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@RestController
public class accountController {
	
	static final Logger LOGGER = LoggerFactory.getLogger(accountController.class);
	
	@Autowired
	accountService AccountService;
	
	
	@GetMapping(value="/api/get_account_data/{accountId}")
	public accountModel getAccountData(@PathVariable(value ="accountId") Long accountId) {
		LOGGER.info("/accounts/add URL is opened");
		LOGGER.info("add account method executed");
		return AccountService.getAccountData(accountId);
	}
	
	
	@PutMapping(value="/api/update_account_data")
	public accountModel updateAccountData(@RequestBody accountModel  accountmodel) {
		LOGGER.info("/accounts/add URL is opened");
		LOGGER.info("update account data method executed");
		return AccountService.updateAccountData(accountmodel);
	}
	
	@PostMapping(value="/api/post_account_data")
	public accountModel createAccountData(@RequestBody accountModel  accountmodel) {
		LOGGER.info("/accounts/add URL is opened");
		LOGGER.info("post account data method executed");
		return AccountService.createAccountData(accountmodel);
	}
	
	
	@PutMapping(value="/api/delete_account_data")
	public void deleteAccountData(@RequestParam Long accountId) {
		LOGGER.info("/accounts/add URL is opened");
		LOGGER.info("delete account data method executed");
		AccountService.deleteAccountData(accountId);
	}
	
	@GetMapping(value="/api/get_count_in_period")
	public Long getcountCreatedAccountsInPeriod(String startDate, String endDate) {
		System.out.println(startDate);
//		return AccountService.getcountCreatedAccountsInPeriod(startDate, endDate);
		return null;
		
	}
	
	public Long getcountCreatedAccounts(LocalDate startDate, LocalDate endDate) {
		return AccountService.getcountCreatedAccounts(startDate, endDate);
	}
	
	@GetMapping(value="/api/get_count_account")
	public Long getcountAccounts() {
		LOGGER.info("/accounts/add URL is opened");
		LOGGER.info("get account count method executed");
		return AccountService.getcountAccounts();
	}
	
	@PutMapping(value="/api/delete_pack_for_acc")
	public void removePackForAccount(@RequestParam Long accountId,@RequestBody packModel packmodel) {
		LOGGER.info("/accounts/add URL is opened");
		LOGGER.info("delete pack for account method executed");
		AccountService.removePackForAccount(accountId, packmodel);
	}


}
