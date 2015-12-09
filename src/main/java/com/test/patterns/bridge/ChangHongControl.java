package com.test.patterns.bridge;

public class ChangHongControl extends Control{

	public ChangHongControl(TV tv) {
		super(tv);
	}
	
	public void switchChannel(int channelNo){
		super.swithChannel(channelNo);
	}

}
