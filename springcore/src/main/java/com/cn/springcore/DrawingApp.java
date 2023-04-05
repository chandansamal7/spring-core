package com.cn.springcore;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {

	public static void main(String[] args) {
		
		//Triangle triangle = new Triangle();
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("com/cn/springcore/spring.xml"));
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/cn/springcore/spring.xml");
		Triangle triangle = (Triangle)factory.getBean("triangle");
		triangle.draw();
		//triangle.getArea();
		//triangle.getPerimeter();

	}

}
