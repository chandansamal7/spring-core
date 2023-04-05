package com.cn.setter.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeDemo {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/cn/setter/injection/employee.xml");
		Employee emp = (Employee) (context.getBean("employee"));
		Employee emp1 = (Employee) (context.getBean("employee1"));
		System.out.println(emp);
		System.out.println(emp1);

	}

}
