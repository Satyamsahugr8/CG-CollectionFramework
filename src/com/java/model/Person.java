package com.java.model;

public class Person {
	
    // state of an object
	int age;
	String name;
	
    // behavior of an object
    //	public void set_value() {
    //	age = 20;
    //	name = "Robin";
    //	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void get_value() {
	System.out.println("Age is " + age);
	System.out.println("Name is " + name);
	}
	
	// main method
	public static void main(String [] args)
	{
		
	// creates a new Person object
	Person p = new Person();
	
    // changes state through behavior
    //	p.set_value();
	p.setAge(22);
	p.setName("Satyam");
	
	p.get_value();
	
	}
}
