package com.cn.auto.wire1;

public class Employee {

	private Address address;

	public Employee() {
		super();
	}

	public Employee(Address address) {
		super();
		this.address = address;
		System.out.println("Inside constructor");
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		System.out.println("Inside setter method");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
}
