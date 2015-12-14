package com.test.patterns.memento;

public class Emp {

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

	public Emp(String name, int age, double sary) {
		super();
		this.name = name;
		this.age = age;
		this.sary = sary;
	}
	
	public EmpMemento memento(){
		return new EmpMemento(this);
	}
	
	public void resc(EmpMemento emp){
		this.age = emp.getAge();
	    this.name = emp.getName();
	    this.sary = emp.getSary();
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", age=" + age + ", sary=" + sary + "]";
	}
	
	
	
	
}
