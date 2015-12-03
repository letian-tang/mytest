package com.test.patterns.state;

public class WaitingToReceive implements State{

	@Override
	public void handler() {
		System.out.println("等待收货");
	}

}
