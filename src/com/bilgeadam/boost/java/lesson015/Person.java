package com.bilgeadam.boost.java.lesson015;

public class Person {
	
	private String firstName;
	private String lastName;
	private String gender;
	private int age;
	
	
	//constructor 
	public Person() { 
	
	}
	
	//constructor
	public Person(String firstName, String lastName, String gender, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.age = age;
	}

	void personInfo() {
		System.out.println("--Person Info--\nFirst Name : "+firstName+"\nLast Name : "+lastName+" \nGender : "+gender+"\nAge : "+age);
	}
	
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender + ", age=" + age
				+ "]";
	}

}
