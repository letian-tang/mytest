package com.test.patterns.state;

public class Context {

	public void setState(State state) {
		state.handler();
	}
}
