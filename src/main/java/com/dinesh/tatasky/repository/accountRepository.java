package com.dinesh.tatasky.repository;

import java.time.LocalDate;

import com.dinesh.tatasky.model.accountModel;
import com.dinesh.tatasky.model.packModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class accountRepository {
	
	
	@Autowired
	accountCrudRepository accountcrudrepository;
	
	public accountModel getAccountData(Long id) {
		
	  accountModel accountmodel=accountcrudrepository.findById(id).get();
		return accountmodel;
	}

	public  accountModel updateAccountData(accountModel  accountmodel) {
		

		accountModel accountModel2=accountcrudrepository.findById(accountmodel.getAccountId()).get();
		accountModel2.setCurrentPack(accountmodel.getCurrentPack());
		accountModel2.setRecharges(accountmodel.getRecharges());
		accountModel2.setRegisteredDate(accountModel2.getRegisteredDate());
		accountModel2.setRequests(accountmodel.getRequests());
		accountModel2.setUser(accountmodel.getUser());
		return accountcrudrepository.save(accountModel2);
		
	}

	public void deleteAccountData(Long accountId) {
		
		accountcrudrepository.deleteById(accountId);
	}

	public Long getcountCreatedAccountsInPeriod(LocalDate startDate, LocalDate endDate) {
		
		System.out.println(startDate);
		return accountcrudrepository.getcountCreatedAccountsInPeriod(startDate,endDate);
	}

	public Long getcountCreatedAccounts(LocalDate startDate, LocalDate endDate) {
		
		return accountcrudrepository.getcountCreatedAccountsInPeriod(startDate,endDate);
	}

	public Long getcountAccounts() {
		
		return accountcrudrepository.getcountAccounts();
	}

	public void removePackForAccount(Long accountId, packModel packmodel) {
		
		accountcrudrepository.removePackForAccount(packmodel);
	}

	public accountModel createAccountData(accountModel accountmodel) {
		
//		accountmodel.getRecharges().forEach(d -> d.setAccount(accountmodel));
//		accountmodel.getRequests().forEach(d -> d.setAccount(accountmodel));
		
		return accountcrudrepository.save(accountmodel);
	}

}
