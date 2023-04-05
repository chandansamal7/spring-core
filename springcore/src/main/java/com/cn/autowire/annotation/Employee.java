package com.cn.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {

	//@Autowired
	private Address address;

	public Employee() {
		super();
	}
	
	@Autowired
	public Employee(Address address) {
		super();
		this.address = address;
		System.out.println("Inside constructor");
	}

	public Address getAddress() {
		return address;
	}
	
	//@Autowired
	public void setAddress(Address address) {
		System.out.println("Inside setter method");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
}
