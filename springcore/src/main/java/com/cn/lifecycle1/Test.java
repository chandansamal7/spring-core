package com.cn.lifecycle1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/cn/lifecycle1/student.xml");
		context.registerShutdownHook();
		Student student = (Student) context.getBean("student");
		System.out.println(student);
	}

}
