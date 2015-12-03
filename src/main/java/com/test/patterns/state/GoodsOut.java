package com.test.patterns.state;

public class GoodsOut implements State{

	@Override
	public void handler() {
		System.out.println("商品出库");
	}

}
