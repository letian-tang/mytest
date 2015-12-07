package com.test.patterns.builder.b1;

public class Director {
	private Bulider builder;

	public Director(Bulider builder) {
		this.builder = builder;
	}
	
	public void construct(){
        builder.buildPart1();
        builder.buildPart2();
    }
	
}
