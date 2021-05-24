package com.dinesh.tatasky.service;

import java.time.LocalDate;

import com.dinesh.tatasky.model.accountModel;
import com.dinesh.tatasky.model.packModel;
import com.dinesh.tatasky.repository.accountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class accountService {
	
	@Autowired
	accountRepository accountrepository;
	
	public accountModel getAccountData(Long accountId) {
		return accountrepository.getAccountData(accountId);
	}
	
	public accountModel updateAccountData(accountModel  accountmodel) {
		return accountrepository.updateAccountData(accountmodel);
	}
	
	public void deleteAccountData(Long accountId) {
		accountrepository.deleteAccountData(accountId);
	}
	
	public Long getcountCreatedAccountsInPeriod(LocalDate startDate, LocalDate endDate) {
		return accountrepository.getcountCreatedAccountsInPeriod(startDate, endDate);
	}
	
	public Long getcountCreatedAccounts(LocalDate startDate, LocalDate endDate) {
		return accountrepository.getcountCreatedAccounts(startDate, endDate);
	}
	
	public Long getcountAccounts() {
		return accountrepository.getcountAccounts();
	}
	
	public void removePackForAccount(Long accountId, packModel packmodel) {
		accountrepository.removePackForAccount(accountId, packmodel);
	}

	public accountModel createAccountData(accountModel accountmodel) {
	
		return accountrepository.createAccountData(accountmodel);
	}

}
