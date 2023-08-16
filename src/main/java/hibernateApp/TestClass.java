package hibernateApp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestClass {
	
	public static void main(String[] args) {
		
		
		Student s1 = new Student();
		s1.setRoll_no(500);
		s1.setName("john");
		s1.setAdress("delhi");
		
		Configuration cfg = new Configuration();
		
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		
		Session sobj = sf.openSession();
		
		Transaction txn = sobj.beginTransaction();
		
		sobj.save(s1);
		
		txn.commit();
		
		System.out.println("student object saved succesfully");
		
		sobj.close();
		
	}

}
