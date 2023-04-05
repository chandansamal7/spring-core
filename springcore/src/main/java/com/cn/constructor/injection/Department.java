package com.cn.constructor.injection;

import java.util.Properties;

public class Department {

	private Properties department;

	public Department() {
		super();
		
	}

	public Department(Properties department) {
		super();
		this.department = department;
	}

	@Override
	public String toString() {
		return "Department [department=" + department + "]";
	}	
}
