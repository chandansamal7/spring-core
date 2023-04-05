package com.cn.setter.injection;

public class Employee {

	private String employeeName;
	private int empId;
	private String empDept;

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}

	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", empId=" + empId + ", empDept=" + empDept + "]";
	}

}
