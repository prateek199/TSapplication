package com.dinesh.tatasky.repository;

import com.dinesh.tatasky.model.accountModel;
import com.dinesh.tatasky.model.servicerequestModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;



public interface serviceCrudRepository extends CrudRepository<accountModel, Long>{

	@Query("select s from servicerequestModel s where s.account = ?1")
	servicerequestModel openedServiceRequestforUser(accountModel accountmodel);
	
	@Query("update servicerequestModel s set s.statusOpened = false where s.serid= ?1")
	servicerequestModel closedServiceRequestforUser(Long serid);
}
