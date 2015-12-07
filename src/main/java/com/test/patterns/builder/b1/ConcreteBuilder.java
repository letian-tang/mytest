package com.test.patterns.builder.b1;

public class ConcreteBuilder extends Bulider {

	@Override
	public void buildPart1() {
		System.out.println("构建A部分");
		product.setPartA(new PartA("partA"));
		
	}

	@Override
	public void buildPart2() {
		System.out.println("构建B部分");
		product.setPartB(new PartB("partB"));
		
	}


}
