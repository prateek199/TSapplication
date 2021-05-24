package com.dinesh.tatasky.repository;

import java.util.List;

import com.dinesh.tatasky.model.packModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



@Repository
public class packRepository {

	
	
	@Autowired
	packCrudRepository packcrudrepository;
	
	
	public packModel getPackData(Long id) {
		
		packModel packmodel = packcrudrepository.findById(id).get();
		return packmodel;
	}

	public packModel addPack(packModel packmodel) {
		
		return packcrudrepository.save(packmodel);
	}

	public packModel updatePack(packModel packmodel) {
		
		packModel packmodel1=packcrudrepository.findById(packmodel.getPackId()).get();
		packmodel1.setDaysValidity(packmodel.getDaysValidity());
		packmodel1.setDescription(packmodel.getDescription());
		packmodel1.setPackCost(packmodel.getPackCost());
		packmodel1.setPlanName(packmodel.getPlanName());
	
		return packcrudrepository.save(packmodel1);
	}

	public List<packModel> findPacksGreaterthanAmount(Double amount) {
		
		return packcrudrepository.findPacksGreaterthanAmount(amount);
	}

	public  List<packModel> findPacksinAscendingOrderbyCost() {
	
		return packcrudrepository.findPacksinAscendingOrderbyCost();
	}

	public List<packModel> findPacksinAscendingOrderbyDaysValidity() {
		
		return packcrudrepository.findPacksinAscendingOrderbyDaysValidity();
	}

	public void deletePack(Long id) {
		
		packcrudrepository.deleteById(id);
	}

}
