package com.cn.constructor.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentDemo {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/cn/constructor/injection/studentconfigue.xml");
		Student student = (Student) context.getBean("student");
		System.out.println(student);
	}

}
