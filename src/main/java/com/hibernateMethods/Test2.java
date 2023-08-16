package com.hibernateMethods;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import hibernateApp.StudentWithAnnotation;

public class Test2 {

	public static void main(String[] args) {

		CarInformation c2 = new CarInformation();
		c2.setEntry_no(3);
		c2.setName("ford");
		c2.setModel("endeviour");
		c2.setSuerpcar(true);

		Configuration cfg = new Configuration();

		cfg.configure();

		SessionFactory sf = cfg.buildSessionFactory();

		Session session = sf.openSession();

//		CarInformation c1 = session.get(CarInformation.class, 3);
//		System.out.println(c2);

//		CarInformation c2 = session.load(CarInformation.class, 3);
//		System.out.println(c2);

		// session.delete(3);
//		session.remove(c1);
		
		Transaction tx = session.beginTransaction();
		
		session.save(c2);
		tx.commit();
		session.close();
		sf.close();

	}

}
