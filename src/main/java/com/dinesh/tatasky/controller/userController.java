package com.dinesh.tatasky.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dinesh.tatasky.model.userModel;
import com.dinesh.tatasky.service.userService;

@RestController
public class userController {
	
	@Autowired

	userService UserService;
	
	@GetMapping(value="/api/get_user_data/{id}")
	public userModel getUserData(@PathVariable(value ="id") Long id) {
		return UserService.getUserData(id);
	}
	
	@GetMapping(value="/api/get_user_data_username/{username}")
	public userModel getUsernameData(@PathVariable(value ="username") String username) {
		return UserService.getUserDatabyName(username);
	}
	
	@PostMapping(value="/api/post_user_data")
	public userModel postRegisterData(@RequestBody userModel usermodel) {
		 return UserService.postRegisterData(usermodel);
	}
	
	@PostMapping(value="/api/delete_user_data")
	public  void deleteUserData(@RequestParam Long id) {
		
		UserService.deleteUserData(id);
	}

	@PutMapping(value="/api/update_user_data")
	public userModel updateUserData(@RequestBody userModel usermodel) {
		 return UserService.updateUserData(usermodel);
	}
}
