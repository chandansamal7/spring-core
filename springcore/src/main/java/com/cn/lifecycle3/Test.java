package com.cn.lifecycle3;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/cn/lifecycle3/config.xml");
		context.registerShutdownHook(); 
		Example example = (Example) context.getBean("subject");
		System.out.println(example);

	}

}
