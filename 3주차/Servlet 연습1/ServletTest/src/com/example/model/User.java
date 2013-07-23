package com.example.model;

public class User {
	private String name;
	private int age;
	private int phoneNumber;
	
	public void setUser(String name, int age, int phoneNumber) {
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
	public int getPhoneNumber() {
		return phoneNumber;
	}

}
