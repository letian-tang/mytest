package com.test.patterns.memento;

public class EmpMemento {

	private String name;
	
	private int age;
	
	private double sary;

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

	public double getSary() {
		return sary;
	}

	public void setSary(double sary) {
		this.sary = sary;
	}

	public EmpMemento(Emp emp) {
		super();
		this.name = emp.getName();
		this.age = emp.getAge();
		this.sary = emp.getSary();
	}
	
	
}
