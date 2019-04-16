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
	
	
	@CrossOrigin(origins="http://localhost:4200")
	@RequestMapping(value = "/signup", method= {RequestMethod.GET, RequestMethod.POST})
	public @ResponseBody void insertUser (
			
			/*
			@RequestParam(value="fname")String fname, 
			@RequestParam(value="lname")String lname, @RequestParam(value="email") String email,
			@RequestParam(value="phoneNum")String phoneNum, @RequestParam(value="address")String address,
			@RequestParam(value="state")String state, @RequestParam(value="city")String city,
			@RequestParam(value="zipCode")String zipcode, @RequestParam(value="username")String username,
			@RequestParam(value="password")String password
			
			*/
			
			@RequestBody User user
			
			) {
		
		System.out.println("In insert user");
		
		//User user = new User(fname, lname, email, username, password, address, state, city, zipcode );
		System.out.println(user);
		userdao.insert(user);
	}
	

}
