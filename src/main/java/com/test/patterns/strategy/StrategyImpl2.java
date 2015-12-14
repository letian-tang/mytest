package com.test.patterns.strategy;

public class StrategyImpl2 implements Strategy{

	@Override
	public double getPrice(double price) {
		
		
		return price*0.9;
	}
	

}
