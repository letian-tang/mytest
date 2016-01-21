package com.test.event;

@FunctionalInterface
public interface EventHandler {
	void handle(EventObject event);
}
