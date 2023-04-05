package com.cn.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/cn/collections/student1.xml");
		Student student = (Student) context.getBean("student");
		
		System.out.println(student.getStudentName());
		
		System.out.println(student.getAddress());
		System.out.println(student.getPhones());
		System.out.println(student.getCourses());
		System.out.println(student.getProps());
		
		
		
	}

}
