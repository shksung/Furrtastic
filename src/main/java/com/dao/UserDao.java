package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.User;
import com.util.HibernateUtil;


@Repository ("userDao")

public class UserDao {
	

	
	public UserDao() {
	}
	
	public void insert(User user) {
		Session ses = HibernateUtil.getSession();
		Transaction tx= ses.beginTransaction();
		ses.save(user);
		tx.commit();
	}
	public User selectById(int id) {
		Session ses= HibernateUtil.getSession();
		User user= ses.get(User.class, id);
		return user;
	}
	
	public User selectByUsername(String username) { //testing purposes
		Session ses= HibernateUtil.getSession();
		//User user= ses.get(User.class, username);
		List<User> userList = ses.createQuery("from User",User.class).list();
		User user1 = null;
		System.out.println(userList);
		for (User user : userList) {
			System.out.println(user);
			if (user.getUsername().equals(username))
				user1 = user;
		}
		System.out.println(user1);
		return user1 ;
	}
	
}
