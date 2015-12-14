package com.test.patterns.mediator;

public interface IUser {
	
	void sendMessage(String msg);
	
	void receiveMessage(String msg);
	
	String getMessage();

}
