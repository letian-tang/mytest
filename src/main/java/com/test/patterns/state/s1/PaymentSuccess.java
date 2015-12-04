package com.test.patterns.state.s1;

public class PaymentSuccess implements State{

	@Override
	public void handler(String msg) {
		System.out.println("付款成功");
	}

}
