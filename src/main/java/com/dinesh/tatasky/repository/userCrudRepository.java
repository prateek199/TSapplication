package com.dinesh.tatasky.repository;

import java.util.Optional;

import com.dinesh.tatasky.model.userModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


public interface userCrudRepository extends CrudRepository<userModel,Long>{
	
	@Query("select u from userModel u where u.username = ?1")
	Optional<userModel> findByUserName(String username);
}
