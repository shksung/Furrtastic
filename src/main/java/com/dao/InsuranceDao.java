package com.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.model.Insurance;
import com.model.Pet;
import com.util.HibernateUtil;

@Repository
public class InsuranceDao {
	public void insert(Insurance ins) {
		Session ses = HibernateUtil.getSession();
		Transaction tx= ses.beginTransaction();
		ses.save(ins);
		tx.commit();
	}
}
