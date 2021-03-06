package com.bilgeadam.boost.java.lesson018;

public class Salary extends Employee {

	private double salary;

	public Salary(String name, String address, int number, double salary) {
		super(name, address, number);
		this.salary = salary;
	}

	@Override
	public void mailCheck() {
		System.out.println("Within mailcheck of Salary class");
		System.out.println("Mailing check to " + getName() + " with salary " + salary);
	}

	@Override
	public double computePay() {
		System.out.println("Computing salary pay for "+ getName());
		return salary/12;
	}

	public double getSalary() {
		return this.salary;
	}

}
