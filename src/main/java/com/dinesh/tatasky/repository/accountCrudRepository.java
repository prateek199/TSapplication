package com.dinesh.tatasky.repository;


import java.time.LocalDate;

import com.dinesh.tatasky.model.accountModel;
import com.dinesh.tatasky.model.packModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;





public interface accountCrudRepository extends CrudRepository<accountModel,Long>{

	
	@Query("delete from accountModel a where a.currentPack = ?1")
	void removePackForAccount(packModel packmodel);
	
	@Query("select count(*) from accountModel a")
	Long getcountAccounts();
	
	@Query("select count(*) from accountModel a where a.registeredDate between ?1 and ?2")
	Long getcountCreatedAccountsInPeriod(LocalDate startDate,LocalDate endDate);
}
