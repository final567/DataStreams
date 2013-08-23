package com.example.model;

public class User {
	private String name;
	private int age;
	private String phoneNumber;
	
	public void setUser(String name, int age, String phoneNumber) {
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;	
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
}
