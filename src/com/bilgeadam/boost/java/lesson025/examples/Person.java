package com.bilgeadam.boost.java.lesson025.examples;

public class Person {

	String name;
	String gender;
	
	
	public Person(String name, String gender) {
		super();
		this.name = name;
		this.gender = gender;
	}


	@Override
	public String toString() {
		return "Person [name=" + this.name + ", gender=" + this.gender + "]";
	}
	
	

}
