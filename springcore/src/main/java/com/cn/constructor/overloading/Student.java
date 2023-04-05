package com.cn.constructor.overloading;

public class Student {

	private int a;
	private int b;

	public Student(int a, int b) {
		System.out.println("cons int-int args");
		this.a = a;
		this.b = b;
	}

	public Student(double a, double b) {

		System.out.println("cons double-double args");
		this.a = (int) a;
		this.b = (int) b;
		System.out.println("a = "+ this.a);
		System.out.println("b = "+ this.b);
	}
	
	 public Student(String a, String b) {
			
	    	System.out.println("cons Strig-string args");
			this.a = Integer.parseInt(a) ;
			this.b = Integer.parseInt(b) ;
		}

	public void sum() {
		int result = this.a + this.b;
		System.out.println(result);
	}

}
