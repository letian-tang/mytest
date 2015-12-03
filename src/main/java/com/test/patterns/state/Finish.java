package com.test.patterns.state;

public class Finish implements State{

	@Override
	public void handler() {
		System.out.println("完成");
	}

}
