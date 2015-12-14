package com.test.patterns.mediator;

public class UserA extends AbstractUser{
	
	
	public UserA(CharRoom charRoom, String name) {
		super(charRoom, name);
		charRoom.register(this);
	}

	@Override
	public void receiveMessage(String msg){
		System.out.println(msg);
	}


}
