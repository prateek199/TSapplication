package com.dinesh.tatasky.controller;

import java.util.List;

import com.dinesh.tatasky.model.packModel;
import com.dinesh.tatasky.service.packService;

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


@SuppressWarnings("unused")
@RestController
public class packController {
	static final Logger LOGGER = LoggerFactory.getLogger(packController.class);
	
@Autowired
packService PackService;
	
	
	
	@GetMapping(value="/api/get_pack_data/{id}")
	public packModel getPackData(@PathVariable(value ="id") Long pid) {
		LOGGER.info("/PackService/add URL is opened");
		LOGGER.info("get pack method executed");
		return PackService.getPackData(pid);
	}

	@PostMapping(value="/api/post_pack_data")
	public packModel addPack(@RequestBody packModel packmodel) {
		LOGGER.info("/PackService/add URL is opened");
		LOGGER.info("add pack method executed");
		return PackService.addPack(packmodel);
	}
	
	@PutMapping(value="/api/post_pack_data")
	public packModel updatePack(@RequestBody packModel packmodel) {
		LOGGER.info("/PackService/add URL is opened");
		LOGGER.info("update pack method executed");
		return PackService.updatePack(packmodel);
	}
	
	
	@GetMapping(value="/api/get_pack_data_filter_amount/{amount}")
	public List<packModel> findPacksGreaterthanAmount(@PathVariable(value ="id") Double amount) {
		LOGGER.info("/PackService/add URL is opened");
		LOGGER.info("get pack amount method executed");
		return PackService.findPacksGreaterthanAmount(amount);
	}
	
	@GetMapping(value="/api/get_pack_data_filter_asc_cost")
	public List<packModel> findPacksinAscendingOrderbyCost() {
		return PackService.findPacksinAscendingOrderbyCost();
	}
	
	@GetMapping(value="/api/get_pack_data_filter_asc_days")
	public List<packModel> findPacksinAscendingOrderbyDaysValidity() {
		return PackService.findPacksinAscendingOrderbyDaysValidity();
	}
	
	public void deletePack(Long id) {
		PackService.deletePack(id);
	}

}
