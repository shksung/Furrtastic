package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dao.InsuranceDao;
import com.model.Insurance;
import com.model.Pet;



@RestController
public class InsuranceController {
	@Autowired
	private InsuranceDao insurancedao;
	
	
	@CrossOrigin(origins="http://localhost:4200")
	@RequestMapping(value = "/insurance.app", method= {RequestMethod.GET, RequestMethod.POST})
	public @ResponseBody void insertUser (@RequestBody Insurance insurance) {
		
		System.out.println("In insert Insurance");
		
		insurancedao.insert(insurance);
	}
}
