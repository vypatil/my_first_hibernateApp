package hibernateApp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestWithAnnotation {

	public static void main(String[] args) {

		StudentWithAnnotation s1 = new StudentWithAnnotation();
		s1.setRoll_no(77);
		s1.setName("akash");
		s1.setAddress("fulewadi");

		Configuration cfg = new Configuration();

		cfg.configure();

		SessionFactory sf = cfg.buildSessionFactory();

		Session sobj = sf.openSession();

		Transaction txn = sobj.beginTransaction();

		// sobj.save(s1);

//		StudentWithAnnotation newobj = sobj.get(StudentWithAnnotation.class, 1);
//		System.out.println(newobj);

		StudentWithAnnotation newobj2 = sobj.load(StudentWithAnnotation.class, 2);
		System.out.println(newobj2);

		txn.commit();

		System.out.println("StudentWithAnnotation object saved succesfully");

		sobj.close();
	}

}
