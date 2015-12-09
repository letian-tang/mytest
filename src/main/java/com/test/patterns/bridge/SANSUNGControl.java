package com.test.patterns.bridge;

public class SANSUNGControl extends Control{

	public SANSUNGControl(TV tv) {
		super(tv);
	}
	
	public void switchChannel(int channelNo){
		super.swithChannel(channelNo);
	}

}
