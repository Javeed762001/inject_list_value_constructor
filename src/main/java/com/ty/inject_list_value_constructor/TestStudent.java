package com.ty.inject_list_value_constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {

	public static void main(String[] args) {
		
		ApplicationContext appCont=new ClassPathXmlApplicationContext("my_config.xml");
	    Student student=(Student)appCont.getBean("myStudent");
		
	    student.display();
	}
}
