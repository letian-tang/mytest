package com.test.patterns.strategy;

public class Client {

	public static void main(String[] args) {
		Context context = new Context();
		context.setStrategy(new StrategyImpl2());
		
		System.out.println(context.getPrice(9.98));
	}
}
