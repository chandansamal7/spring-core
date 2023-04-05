package com.cn.setter.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/cn/setter/ref/employee.xml");
		
		Employee emp = (Employee) context.getBean("employee");
		System.out.println(emp);
	}

}
