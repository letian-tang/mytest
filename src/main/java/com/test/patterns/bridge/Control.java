package com.test.patterns.bridge;

public abstract class Control {

	private TV tv;

	public Control(TV tv) {
		this.tv = tv;
	}
	
	void on(){
		tv.on();
	}
	 
	void off(){
		tv.off();
	}
	
	void swithChannel(int channelNo){
		tv.swithChannel(channelNo);
	}

}
