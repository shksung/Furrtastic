package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dao.PetDao;
import com.model.Pet;
import com.model.User;



@RestController
public class AddPetController {

	@Autowired
	private PetDao petdao;	
	
	@CrossOrigin(origins="http://localhost:4200")
	@RequestMapping(value = "/pet.app", method= {RequestMethod.GET, RequestMethod.POST}, produces="application/json")
	public @ResponseBody void insertPet (@RequestBody Pet pet) {
		
		System.out.println("In insert Pet");
		System.out.println(pet.toString());
		petdao.insert(pet);
	}
	
	
}
