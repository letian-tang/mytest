package com.test.patterns.mediator;

import java.util.ArrayList;
import java.util.List;

public class CharRoomImpl implements CharRoom {

	List<IUser> users = new ArrayList<>();

	@Override
	public void register(IUser user) {
		if(!users.contains(user)){
			users.add(user);
		}
	}

	@Override
	public void remove(IUser user) {
		users.remove(user);
	}


	@Override
	public void notifyAllMessage(IUser user) {
		for(IUser userTemp : users){
			if(userTemp !=user){
				userTemp.receiveMessage(user.getMessage());
			}
		}
	}

}
