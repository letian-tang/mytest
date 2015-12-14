package com.test.patterns.mediator;

public class UserB extends AbstractUser{
	
	public UserB(CharRoom charRoom, String name) {
		super(charRoom, name);
		charRoom.register(this);
	}

	@Override
	public void receiveMessage(String msg) {
		System.out.println(msg);
	}

}
