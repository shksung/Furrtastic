package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dao.UserDao;
import com.model.User;

@RestController
public class LoginController {
	@Autowired
	private UserDao userdao;
	
	public LoginController() {
		
	}
	
	@CrossOrigin(origins="http://localhost:4200")
	@RequestMapping(value= "/login.app", method= {RequestMethod.GET, RequestMethod.POST}
			)
	
	public @ResponseBody User getUser(@RequestBody User user) {
		System.out.println("What's good biatch");
		return userdao.selectByUsername(user.getUsername());
	}
	
}
