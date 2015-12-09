package com.test.patterns.adapter;

public class Clinet {

	
	public static void main(String[] args) {
		System.out.println("类适配使用继承");
		Adapter2 adapter2 = new Adapter2();
		adapter2.handler();
		
		System.out.println("------------------");
		
		System.out.println("对象适配使用组合");
		Adaptee adaptee = new Adaptee();
		Adapter adapter1 = new Adapter(adaptee);
		adapter1.handler();
		
		

	}

}
