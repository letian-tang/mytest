package com.test.patterns.state.s1;

public class CommodityDistribution implements State{

	@Override
	public void handler(String msg) {
		System.out.println("商品配货");
	}

}
