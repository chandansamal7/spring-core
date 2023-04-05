package com.cn.lifecycle1;

public class Student {
	
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		System.out.println("Setting age");
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [age=" + age + "]";
	}
	public void init() {
		System.out.println("initialising");
	}
	public void destroy() {
		System.out.println("Destroying");
	}
}
