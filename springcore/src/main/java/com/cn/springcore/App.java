package com.cn.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
     
        ApplicationContext context = new ClassPathXmlApplicationContext("com/cn/springcore/configure.xml");
        Student  student1 = (Student) context.getBean("student1");
        System.out.print(student1);
    }
}
