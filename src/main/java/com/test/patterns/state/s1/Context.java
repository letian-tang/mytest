package com.test.patterns.state.s1;

public class Context {
	
	private State state;

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
		state.handler("");
	}
}
