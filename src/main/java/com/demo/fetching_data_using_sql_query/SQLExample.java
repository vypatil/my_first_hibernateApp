package com.demo.fetching_data_using_sql_query;

import java.util.Arrays;
import java.util.List;

import javax.naming.ConfigurationException;
import javax.sound.midi.Soundbank;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Array;

import hibernateApp.Student;

import org.hibernate.SessionFactory;

public class SQLExample {

	public static void main(String[] args) {

//		Configuration cfg = new Configuration();
//		cfg.configure();
//		
//		SessionFactory sf = cfg.buildSessionFactory();

		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		Session session = factory.openSession();

		// SQL Query
		String s = "select * from Student";

		// local variable using ctrl+1.
		NativeQuery nq = session.createSQLQuery(s);

		List<Object[]> list = nq.list();

		for (Object[] student : list) {

			//System.out.println(Arrays.toString(student));

			System.out.println(student[2] + " " + student[3]);

		}

		session.close();
		factory.close();
	}

}
