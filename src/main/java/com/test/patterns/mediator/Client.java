package com.test.patterns.mediator;

public class Client {
	
	public static void main(String[] args) {
		
		CharRoom charRomm = new CharRoomImpl();
		IUser userA = new UserA(charRomm,"小明");
		IUser userB = new UserA(charRomm,"磊磊");
		IUser userC = new UserA(charRomm,"娜娜");
		
		userA.sendMessage("hello，大家好");
		
		userB.sendMessage("你好，欢迎");
		
		userC.sendMessage("欢迎，我是娜娜");
	}

}
