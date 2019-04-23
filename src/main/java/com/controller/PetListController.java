package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dao.PetDao;
import com.model.Pet;
import com.model.User;

@RestController
public class PetListController {
	@Autowired
	private PetDao petdao;	
	
	@CrossOrigin(origins="http://localhost:4200")
	@RequestMapping(value = "/getpets.app", method= {RequestMethod.GET, RequestMethod.POST}, produces="application/json")
	public @ResponseBody List <Pet> getPets(@RequestBody User user) {
		System.out.println(user);
		List <Pet> petList =petdao.selectByOwnerUsername(user.getUserID());
		
		return petList;
	} 
	
}
