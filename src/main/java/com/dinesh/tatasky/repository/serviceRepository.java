package com.dinesh.tatasky.repository;

import com.dinesh.tatasky.model.accountModel;
import com.dinesh.tatasky.model.servicerequestModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



@Repository
public class serviceRepository {
	
	@Autowired 
	serviceCrudRepository servicecrudRepository;

    public servicerequestModel createServiceRequestforUser(accountModel accountmodel) {
      
        return servicecrudRepository.save(accountmodel).getRequests().iterator().next();
    }
    public servicerequestModel openedServiceRequestforUser(accountModel accountmodel) {
       
        return servicecrudRepository.openedServiceRequestforUser(accountmodel);
    }
    public servicerequestModel closedServiceRequestforUser(Long serid) {
       
        return servicecrudRepository.closedServiceRequestforUser(serid);
    }

}
