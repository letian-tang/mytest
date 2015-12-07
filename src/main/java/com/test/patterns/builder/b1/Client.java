package com.test.patterns.builder.b1;

public class Client {

	public static void main(String[] args) {
		
		Bulider builder = new ConcreteBuilder();
        Director director = new Director(builder);
        director.construct();
        Product product = builder.build();
        System.out.println(product.getPartA().getName());
        System.out.println(product.getPartB().getName());

	}

}
