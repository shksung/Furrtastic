package com.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.model.Pet;
import com.model.User;
import com.util.HibernateUtil;

@Repository ("petDao")
public class PetDao {
	
	public PetDao() {
		
	}
	public void insert(Pet pet) {
		Session ses = HibernateUtil.getSession();
		Transaction tx= ses.beginTransaction();
		ses.save(pet);
		tx.commit();
	}
	
	public List<Pet> selectByOwnerUsername(int i) { //testing purposes
		Session ses= HibernateUtil.getSession();
		//User user= ses.get(User.class, username);
		List<Pet> petList = ses.createQuery("from Pet",Pet.class).list();
		List <Pet> pet1  = new ArrayList<Pet>();
		//System.out.println(userList);
		for ( Pet pet : petList) {
			System.out.println(pet);
			if (pet.getOwner()==i) {
				pet1.add(pet);
			}
		}
		return pet1 ;
	}
}
