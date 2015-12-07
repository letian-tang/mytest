package com.test.patterns.builder.b2;

public class Client {

	public static void main(String[] args) {
		
		Builder builder1 = new MobilePackageImpl1();
		
		Builder builder2 = new MobilePackageImpl2();
		
		Director director = new Director();
		
		System.out.println(director.createMobilePackage(builder1));
		
		System.out.println(director.createMobilePackage(builder2));
		
		

	}

}
