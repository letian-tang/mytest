package com.test.patterns.bridge;

public class ChangHong implements TV{

	@Override
	public void on() {
		System.out.println("长虹电视开");
	}

	@Override
	public void off() {
		System.out.println("长虹电视关");
	}

	@Override
	public void swithChannel(int channelNo) {
		System.out.println("长虹电视换台："+channelNo);
	}

}
