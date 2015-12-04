package com.test.patterns.state.s1;

public class SubmitOrders implements State{

	@Override
	public void handler(String msg) {
		System.out.println("提交订单");
	}
}
