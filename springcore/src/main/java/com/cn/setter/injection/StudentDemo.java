package com.cn.setter.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentDemo {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/cn/setter/injection/student.xml");
		Student student = (Student)context.getBean("student");
		//Student student1 = (Student)context.getBean("student1");
		System.out.println(student);
		//System.out.println(student1);
	}

}
