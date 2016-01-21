package com.test.event;

public interface TaskExecutor extends Task {
	/**
	 * 提交一个任务
	 * 
	 * @param task
	 */
	public void submit(Task task);
}
