package com.test.patterns.builder.b1;

public abstract class Bulider {

	protected Product product = new Product();
	
	public abstract void buildPart1();
    public abstract void buildPart2();

	public Product build() {
		return product;
	}

}
