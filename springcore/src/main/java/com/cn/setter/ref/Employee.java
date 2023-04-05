package com.cn.setter.ref;

import java.util.*;

public class Employee {

	private List<String> name;
	private Set<String> phones;
	private Map<Integer, String> dept;
	private Address address;

	public List<String> getName() {
		return name;
	}

	public void setName(List<String> name) {
		this.name = name;
	}

	public Set<String> getPhones() {
		return phones;
	}

	public void setPhones(Set<String> phones) {
		this.phones = phones;
	}

	public Map<Integer, String> getDept() {
		return dept;
	}

	public void setDept(Map<Integer, String> dept) {
		this.dept = dept;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", phones=" + phones + ", dept=" + dept + ", address=" + address + "]";
	}

}
