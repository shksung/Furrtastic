package com.driver;

import com.dao.UserDao;
import com.model.User;

public class Main {

	public static void main(String[] args) {
	UserDao userdao = new UserDao();
//		User user = new User("Kevin", "Sung", "k@gmail","address", "CA", "Tracy", "239430249", "ksung24", "1232131"); 
		System.out.println(userdao.selectByUsername("ksung24"));
		System.out.println("In Main");
		
		
	}

}
