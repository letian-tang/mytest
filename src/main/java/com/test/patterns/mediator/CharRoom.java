package com.test.patterns.mediator;

public interface CharRoom {

	void register(IUser user);
	
	void remove(IUser user);

	void notifyAllMessage(IUser user);
	
}
