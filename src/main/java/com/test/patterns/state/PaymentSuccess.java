package com.test.patterns.state;

public class PaymentSuccess implements State{

	@Override
	public void handler() {
		System.out.println("付款成功");
	}

}
