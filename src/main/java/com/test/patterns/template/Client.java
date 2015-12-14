package com.test.patterns.template;

public class Client {
	
	public static void main(String[] args) {
		AbstractMethod obj1 = new MethodImpl1();
		
		AbstractMethod obj2 = new MethodImpl2();
		
		obj1.m3();
		System.out.println("----------------");
		obj2.m3();
		
	}

}
