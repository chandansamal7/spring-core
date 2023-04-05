package com.cn.lifecycle2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cn.lifecycle1.Student;

public class TestPepsi {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/cn/lifecycle2/config.xml");
		context.registerShutdownHook();
		Pepsi pepsi = (Pepsi) context.getBean("pepsi");
		System.out.println(pepsi);

	}

}
