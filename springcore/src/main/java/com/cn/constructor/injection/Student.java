package com.cn.constructor.injection;
import java.util.*;
public class Student {
	
	private String name;
	private int id;
	private String address;
	private List<String> item;
	private Set<String> phones;
	private Map<Integer, String>course;
	private Department dept;
	
	
	public Student() {
		super();
	}


	public Student(String name, int id, String address, List<String> item, Set<String> phones,
			Map<Integer, String> course, Department dept) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
		this.item = item;
		this.phones = phones;
		this.course = course;
		this.dept = dept;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", address=" + address + ", item=" + item + ", phones=" + phones
				+ ", course=" + course + ", dept=" + dept + "]";
	}

	

}
