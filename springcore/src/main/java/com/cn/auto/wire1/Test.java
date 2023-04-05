package com.cn.auto.wire1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/cn/auto/wire1/cofigure.xml");
		Employee  emp = context.getBean("employee",Employee.class);
		System.out.println(emp);

	}

}
