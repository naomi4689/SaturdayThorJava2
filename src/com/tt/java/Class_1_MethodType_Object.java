package com.tt.java;

public class Class_1_MethodType_Object {
	
	private String name;
	private int age;

	public Class_1_MethodType_Object(String initName, int initAge) {
		
		setName(initName);
		setAge(initAge);
		
		printDetails();

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void printDetails() {
		
		System.out.println(getName() + " is about " + getAge());
		
	}}
