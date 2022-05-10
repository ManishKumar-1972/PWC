package com.client;


import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entity.Employee;
import com.hibernate.HibernateUtility;

public class Client {
	
	public static void main(String[] args) {
		Session session = HibernateUtility.getSession();
		
		Transaction tx = session.beginTransaction();
		
		Employee em = new Employee(101, "admin", "mumbai");
		
		sesssion.save(em);
		tx.commit();
		System.out.println("user added");
	}

}
