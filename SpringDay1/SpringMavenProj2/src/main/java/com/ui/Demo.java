package com.ui;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bean.*;
public class Demo {

	public static void main(String[] args) {
		

		AnnotationConfigApplicationContext context=
				new AnnotationConfigApplicationContext(com.config.AppConfig.class);
	   
		Employee e=(Employee)context.getBean("empbean");
	    System.out.println(e);  
	    
	    Address ad=(Address)context.getBean("address");
	    System.out.println(ad);
	}

}
