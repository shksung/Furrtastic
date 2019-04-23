package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dao.UserDao;
import com.model.User;

@RestController
public class SignupController {
	@Autowired
	private UserDao userdao;
	
	public SignupController() {
		
	}
	
	
	@CrossOrigin(origins="18.216.185.182:4200")
	@RequestMapping(value = "/signup.app", method= {RequestMethod.GET, RequestMethod.POST}, produces="application/json")
	public @ResponseBody void insertUser (
			
			
			@RequestBody User user
		
			
			) {
		
		System.out.println("In insert user");
		
		//User user = new User(fname, lname, email, username, password, address, state, city, zipcode );
		System.out.println(user);
		userdao.insert(user);
	}
	

}
