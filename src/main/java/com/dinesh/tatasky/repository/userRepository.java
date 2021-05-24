package com.dinesh.tatasky.repository;

import com.dinesh.tatasky.model.userModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



@Repository
public class userRepository {
	
	
	@Autowired
	userCrudRepository usercrudrepository;

	public userModel getUserData(Long id) {
		
		userModel usermodel=usercrudrepository.findById(id).get();
		return usermodel;
	}
	
	

	public  userModel postRegisterData(userModel usermodel) {
		
		
		return usercrudrepository.save(usermodel);
		
	}

	public userModel updateUserData(userModel usermodel) {
		
		userModel usermodel1 =usercrudrepository.findById(usermodel.getId()).get();
		/*usermodel.setFirstname(usermodel.getFirstname());
		usermodel1.setLastname(usermodel.getLastname());*/
		usermodel1.setPassword(usermodel.getPassword());
		/*usermodel1.setRole(usermodel.getRole());*/
		usermodel1.setUsername(usermodel.getUsername());
		return usercrudrepository.save(usermodel1);
		
	}

	public  userModel getUserDatabyName(String username) {
		
		userModel usermodel=usercrudrepository.findByUserName(username).get();
		return usermodel;
	}

	public  void deleteUserData(Long id) {
		
		usercrudrepository.deleteById(id);
		
	}

}
