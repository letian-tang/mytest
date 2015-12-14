package com.test.patterns.memento;

public class Client {

	public static void main(String[] args) {
		Emp emp = new Emp("张三",19,3000);
		System.out.println(emp);
		Care ca = new Care();
		
		
		ca.setEmpMemento(new EmpMemento(emp));
		
		emp.setAge(20);
		emp.setSary(4000);
		System.out.println(emp);
		
		emp.resc(ca.getEmpMemento());
		System.out.println(emp);
		
	}
}
