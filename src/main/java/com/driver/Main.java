package com.driver;

import com.dao.UserDao;

public class Main {

	public static void main(String[] args) {
		UserDao userdao = new UserDao();
		System.out.println(userdao.selectByUsername("jparikh"));
		System.out.println("In Main");

	}

}
