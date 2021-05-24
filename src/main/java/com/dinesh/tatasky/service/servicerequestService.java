package com.dinesh.tatasky.service;

import com.dinesh.tatasky.model.accountModel;
import com.dinesh.tatasky.model.servicerequestModel;
import com.dinesh.tatasky.repository.serviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class servicerequestService {
	
    @Autowired
    serviceRepository servicerepository;
    
    public servicerequestModel createServiceRequestforUser(accountModel accountmodel) {
        return servicerepository.createServiceRequestforUser(accountmodel);
    }
    
    public servicerequestModel openedServiceRequestforUser(accountModel accountmodel) {
        return servicerepository.openedServiceRequestforUser(accountmodel);
    }
    
    public servicerequestModel closedServiceRequestforUser(Long servicerequestID) {
        return servicerepository.closedServiceRequestforUser(servicerequestID);
    }

}
