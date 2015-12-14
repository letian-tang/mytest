package com.test.patterns.mediator;

public abstract class AbstractUser implements IUser {
	
    protected String msg;
	
	protected CharRoom charRoom;

	private String name;

	public AbstractUser(CharRoom charRoom, String name) {
		super();
		this.charRoom = charRoom;
		this.name = name;
		charRoom.register(this);
	}
	
	@Override
	public void sendMessage(String msg) {
		
		this.msg = msg;
		System.out.println(this.name + " 说:" + this.msg);
		charRoom.notifyAllMessage(this);
	}
	
	@Override
	public String getMessage(){
		return msg;
	}
	
}
