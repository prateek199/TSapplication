package com.dinesh.tatasky.service;


import com.dinesh.tatasky.model.userModel;
import com.dinesh.tatasky.repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class userService {
	
	@Autowired
	userRepository userrepository;
	
	public userModel getUserData(Long id) {
		return userrepository.getUserData(id);
	}

	public userModel postRegisterData(userModel usermodel) {
		return userrepository.postRegisterData(usermodel);
	}
	
	public userModel updateUserData(userModel usermodel) {
		 return userrepository.updateUserData(usermodel);
	}
	
	public userModel getUserDatabyName(String username) {
		return userrepository.getUserDatabyName(username);
	}
	
	public void deleteUserData(Long id) {
		userrepository.deleteUserData(id);
	}


}
