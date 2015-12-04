package com.test.patterns.state.s1;

public class GoodsOut implements State{

	@Override
	public void handler(String msg) {
		System.out.println("商品出库");
	}

}
