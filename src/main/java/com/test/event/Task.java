package com.test.event;

@FunctionalInterface
public interface Task {
	/**
	 * 执行一个具体任务
	 */
	 void execute();
}
