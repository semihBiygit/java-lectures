package com.bilgeadam.boost.java.lesson017;

public class Dog extends Animal {

	String color = "black";
	
	void printColor() {
		System.out.println(color);
		System.out.println(super.color);
	}
}
