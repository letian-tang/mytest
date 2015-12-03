package com.test.patterns.state;

public class SubmitOrders implements State{

	@Override
	public void handler() {
		System.out.println("提交订单");
	}

}
