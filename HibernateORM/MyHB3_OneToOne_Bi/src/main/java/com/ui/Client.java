package com.ui;
import java.util.Date;
import java.util.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.hibernate.*;
import org.hibernate.cfg.*;

import com.bean.Adhar;
import com.bean.Employee;

public class Client {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration().configure();
		/*
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()//
        .configure("hibernate.cfg.xml").build();

// Create a metadata sources using the specified service registry.
Metadata metadata = new MetadataSources(serviceRegistry).getMetadataBuilder().build();

//return metadata.getSessionFactoryBuilder().build();

*/

// configuration generates session factory
SessionFactory sf=cfg.buildSessionFactory();
//SessionFactory sf=metadata.getSessionFactoryBuilder().build();

		// to establish connection to the database representaed by object session
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
		// code for inserting records
		
		Date doj=sdf.parse("21-05-2003 09:30:00");		
		Employee e=new Employee(100,"king",24000.00,doj);
		doj=sdf.parse("20-07-2003 09:30:00");
		Employee e1=new Employee(101,"raja",30000.00,doj);
		doj=sdf.parse("11-04-2003 09:30:00");
		
		Adhar ad1=new Adhar(1111,"aaa");
		ad1.setEmployee(e);
		e.setAdhar(ad1);
		
		Adhar ad2=new Adhar(1112,"bbb");
		ad2.setEmployee(e1);
		e1.setAdhar(ad2);
		
		
		session.save(ad1);
		session.save(ad2);


 
		// createQuery ====> queries to the POJO class
		Query q=session.createQuery("from Employee");
		List<Employee> elist=q.list();
		for(Employee ee:elist)
		{
						System.out.println(ee+"  "+ee.getAdhar());
		}
		tx.commit();
		
		session.close();
		sf.close();
		System.out.println("Record is inseted");
		


	}

}
