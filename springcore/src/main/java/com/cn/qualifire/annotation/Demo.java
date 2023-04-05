package com.cn.qualifire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/cn/qualifire/annotation/configure.xml");
		Student student = context.getBean("student", Student.class);
		System.out.println(student);
	}
}
