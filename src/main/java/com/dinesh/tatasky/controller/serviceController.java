package com.dinesh.tatasky.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.dinesh.tatasky.model.accountModel;
import com.dinesh.tatasky.model.servicerequestModel;
import com.dinesh.tatasky.service.servicerequestService;

@RestController
public class serviceController {
	static final Logger LOGGER = LoggerFactory.getLogger(serviceController.class);
	
    @Autowired
	servicerequestService servicerequestService;
	
    @GetMapping(value="/api/post_openedServiceRequestforUser_data")
    public servicerequestModel openedServiceRequestforUser(@RequestBody accountModel accountmodel) {
    	LOGGER.info("/servicerequestService/add URL is opened");
		LOGGER.info("get service request method executed");
         return servicerequestService.openedServiceRequestforUser(accountmodel);
    }
    
    @PostMapping(value="/api/post_createservicerequest_data")
    public servicerequestModel createServiceRequest(@RequestBody accountModel accountmodel) {
        return servicerequestService.createServiceRequestforUser(accountmodel);
    }
    
    @PostMapping(value="/api/close_servicerequest")
    public servicerequestModel closedServiceRequestforUser(@RequestParam Long serviceRequestId) {
    	LOGGER.info("/servicerequestService/add URL is opened");
		LOGGER.info("close service request method executed");
        return servicerequestService.closedServiceRequestforUser(serviceRequestId);
    }

}
