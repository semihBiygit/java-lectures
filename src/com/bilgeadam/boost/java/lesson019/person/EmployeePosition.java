package com.bilgeadam.boost.java.lesson019.person;

public enum EmployeePosition {

	CLERK("Tezgahtar"), MANAGER("Yönetici"), CASHIER("Kasiyer");

	private String name;

	EmployeePosition(String name) {
		this.name=name;
	}
	
	public String getName() {
		return this.name;
	}
}
