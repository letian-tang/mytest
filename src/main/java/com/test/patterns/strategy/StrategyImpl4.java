package com.test.patterns.strategy;

public class StrategyImpl4 implements Strategy{

	@Override
	public double getPrice(double price) {
		
		
		return price*0.8;
	}
	

}
