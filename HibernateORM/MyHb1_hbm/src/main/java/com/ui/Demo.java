package com.ui;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bean.Employee;

public class Demo {

	public static void main(String[] args) throws ParseException {
		   Configuration cfg=new Configuration();
	        cfg.configure("hibernate.cfg.xml");

	        SessionFactory factory=cfg.buildSessionFactory();

	        // application gets connected with database
	        Session session=factory.openSession();

	        
	        // code for inserting records
	        SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");

	          Date doj=sdf.parse("21-05-2003 09:30:00");
	        Employee e=new Employee(100,"king",24000.00,doj);

	        doj=sdf.parse("20-07-2003 09:30:00");
	        Employee e1=new Employee(101,"raja",30000.00,doj);

	        doj=sdf.parse("11-04-2003 09:30:00");
	        Employee e2=new Employee(102,"ajay",22000.00,doj);

	        doj=sdf.parse("27-08-2003 09:30:00");
	        Employee e3=new Employee(103,"seema",32000.00,doj);

	        doj=sdf.parse("15-05-2003 09:30:00");
	        Employee e4=new Employee(104,"don",40000.00,doj);

	        Transaction tx=session.beginTransaction();
	        // take data from employee insert it to database table myemp
	        session.save(e1);
	        session.save(e2);
	        session.save(e3);
	        session.save(e4);
	        session.save(e);
	        tx.commit();
			
	         
	        // code fro update
	        // fetch the record from databse and then update
	        /*
	        Transaction tx=session.beginTransaction();
	        Employee myemp= session.get(com.bean.Employee.class,new Integer(101));
	        System.out.println("Before update "+myemp);
	        //update changes
	        myemp.setSalary(50000);
	        session.saveOrUpdate(myemp);  // update reocrd
	        myemp= session.get(com.bean.Employee.class,new Integer(101));
	        System.out.println("After update "+myemp);

	        tx.commit();
			*/
	       
	        // delete record
	        /*
	        Transaction tx=session.beginTransaction();
	        Employee myemp1= session.get(com.bean.Employee.class,new Integer(101));
	        System.out.println("Before delete "+myemp1);
	        session.remove(myemp1);
	        tx.commit();

	         */
	        // select all records
	        Query q=session.createQuery("from Employee");
	        List<Employee> elist=q.list();
	        for(Employee ee:elist)
	        {
	            System.out.println(ee);
	        }

	        session.close();
	        factory.close();



	}

}
