package com.dinesh.tatasky.repository;

import java.util.List;

import com.dinesh.tatasky.model.packModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;





public interface packCrudRepository extends CrudRepository<packModel,Long>{
	
	@Query("select p  from packModel p where p.packCost > ?1")
	List<packModel> findPacksGreaterthanAmount(double Amount);

	@Query("select p  from packModel p order by p.packCost asc")
	List<packModel> findPacksinAscendingOrderbyCost();
	
	@Query("select p  from packModel p order by p.daysValidity asc")
	List<packModel> findPacksinAscendingOrderbyDaysValidity();
}
