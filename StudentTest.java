package com.te.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {

	public static void main(String[] args) 
	{
ApplicationContext context=new ClassPathXmlApplicationContext("student.xml");
		
		Student student=(Student)context.getBean("stud");
		System.out.println(student.getSid());
		System.out.println(student.getSname());
		System.out.println(student.getAdd().getPincode());
		System.out.println(student.getAdd().getState());
		
		
	}

}
