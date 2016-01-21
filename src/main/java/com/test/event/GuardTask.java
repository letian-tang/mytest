package com.test.event;

public class GuardTask extends TaskEventEmitter {
	private final int N;

	public GuardTask(final TaskManager manager, int n) {
		super(manager.getExecutor());
		this.N = n;
		on("end", new EventHandler() {
			private int i = 0;

			@Override
			public void handle(EventObject event) {
				i++;
				if (i >= N) {
					manager.stop();
				}
			}
		});
		on("end", new EventHandler() {
			private int i = 0;

			@Override
			public void handle(EventObject event) {
				i++;
				if (i >= N) {
					manager.stop();
				}
			}
		});
	}

	@Override
	protected void run() throws Exception {

	}
}
