package com.test.patterns.bridge;

public class SANSUNG implements TV{

	@Override
	public void on() {
		System.out.println("三星电视开");
	}

	@Override
	public void off() {
		System.out.println("三星电视关");
	}

	@Override
	public void swithChannel(int channelNo) {
		System.out.println("三星电视换台："+channelNo);
	}

}
