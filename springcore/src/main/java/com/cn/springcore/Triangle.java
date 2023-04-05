package com.cn.springcore;

public class Triangle {
	
	private String type;
	private int length;
	private int breath;
	private double height;
	
	public Triangle(String type) {
		this.type = type;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreath() {
		return breath;
	}

	public void setBreath(int breath) {
		this.breath = breath;
	}

	public void draw() {
		System.out.println(getType()+ " Triangle drawn baby");
	}
	
	public void getArea() {
		System.out.println("Area is: " + getLength() * getBreath());
	}
	
	public void getPerimeter() {
		System.out.println("Perimeter is: " + getLength() * getBreath() * getHeight());
	}

}
