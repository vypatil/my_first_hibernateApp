package com.hibernateMethods;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestCarInfo {
	
	public static void main(String[] args) {
		
		CarInformation c1 = new CarInformation();
		c1.setEntry_no(3);
		c1.setName("rollsRoyce");
		c1.setModel("boat");
		c1.setSuerpcar(true);
		
		Configuration cfg = new Configuration();
		
		cfg.configure();
		
		SessionFactory sf = cfg.buildSessionFactory();
		
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		
//		session.save(c1);
		
		session.delete(c1);
		
		System.out.println(c1);
		
		tx.commit();
		
		session.close();
		
	}

}
