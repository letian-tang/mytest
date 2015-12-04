package com.test.patterns.state.s1;

public class Finish implements State{

	@Override
	public void handler(String msg) {
		System.out.println("完成");
	}

}
