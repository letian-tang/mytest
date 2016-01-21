package com.test.event;

public class CompoundTaskDemo {
	public static void main(String[] args) {
		TaskManager manager = new TaskManager();
		TaskExecutor executor = manager.getExecutor();
		manager.start();
		TaskEventEmitter ioTask = TaskHelper.createIOTask(executor, "info.txt");
		TaskEventEmitter piTask = TaskHelper.createPiTask(executor, 100);
		final TaskEventEmitter guardTask = new GuardTask(manager, 2);
		EventHandler handler = (evevt)->{
			guardTask.emit("end");
		};
		ioTask.on("close", handler);
		piTask.on("finish", handler);
		executor.submit(ioTask);
		executor.submit(piTask);
		executor.submit(guardTask);

	}
}
