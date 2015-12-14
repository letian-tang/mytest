package com.test.patterns.strategy;

public class Context {
	
	private Strategy strategy;

	public Context(Strategy strategy) {
		super();
		this.strategy = strategy;
	}
	
	public Context() {
		super();
	}
	
	public double getPrice(double price){
		return strategy.getPrice(price);
	}

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}

}
