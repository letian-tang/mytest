package com.test.patterns.state;

public class CommodityDistribution implements State{

	@Override
	public void handler() {
		System.out.println("商品配货");
	}

}
