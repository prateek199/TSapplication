package com.dinesh.tatasky.service;

import java.util.List;

import com.dinesh.tatasky.model.packModel;
import com.dinesh.tatasky.repository.packRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class packService {
	
	@Autowired
	packRepository packrepository;
	
	
	public packModel getPackData(Long pid) {
		return packrepository.getPackData(pid);
	}

	public packModel addPack(packModel packmodel) {
		return packrepository.addPack(packmodel);
	}
	
	public packModel updatePack(packModel packmodel) {
		 return packrepository.updatePack(packmodel);
	}
	
	public List<packModel> findPacksGreaterthanAmount(Double amount) {
		return packrepository.findPacksGreaterthanAmount(amount);
	}
	
	public List<packModel> findPacksinAscendingOrderbyCost() {
		return packrepository.findPacksinAscendingOrderbyCost();
	}
	
	public List<packModel> findPacksinAscendingOrderbyDaysValidity() {
		return packrepository.findPacksinAscendingOrderbyDaysValidity();
	}
	
	public void deletePack(Long id) {
		packrepository.deletePack(id);
	}
}
