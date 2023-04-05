package com.cn.setter.ref;

import java.util.Properties;

public class Address {
	
//	private String address;
//
//	public String getAddress() {
//		return address;
//	}
//
//	public void setAddress(String address) {
//		this.address = address;
//	}
//
//	@Override
//	public String toString() {
//		return "Address [address=" + this.address + "]";
//	}
	

	private Properties properties;

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	@Override
	public String toString() {
		return "Address [properties=" + properties + "]";
	}

}
