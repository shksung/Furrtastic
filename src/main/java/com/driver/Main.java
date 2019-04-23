package com.driver;

import com.dao.InsuranceDao;
import com.dao.PetDao;
import com.dao.UserDao;
import com.model.Insurance;
import com.model.Pet;
import com.model.User;

public class Main {

	public static void main(String[] args) {
	UserDao userdao = new UserDao();
	PetDao petdao= new PetDao();
	InsuranceDao insdao = new InsuranceDao();
		User user = new User("Kevin", "Sung", "k@gmail","address", "CA", "Tracy", "239430249", "ksung24", "1232131"); 
		userdao.insert(user);
		//user.getPetList().toString();
		//User user = userdao.selectByUsername("ksung24");
		//Pet pet = new Pet("TestPet2", "chiuahaha2", "3", "no", "test2", user);
		//petdao.insert(pet);
		
	//System.out.println(user.getPetList().get(0).getIns());
		
		//Pet pet = user.getPetList().get(0);
		//Insurance ins = new Insurance (200, 34, "CoverageTest",35, pet);
		//insdao.insert(ins);
		
	}

}
