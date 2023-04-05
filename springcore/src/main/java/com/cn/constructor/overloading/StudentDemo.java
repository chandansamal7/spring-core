package com.cn.constructor.overloading;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentDemo {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/cn/constructor/overloading/student.xml");
		Student student = (Student) context.getBean("student");
		student.sum();

	}

}
