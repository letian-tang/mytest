package com.test;

import java.util.HashSet;
import java.util.Set;

/**
 * [简要描述]:<br/>
 * [详细描述]:<br/>
 * 
 * @author tangdingyi E-mail: 13913364179@163.com
 * @date 创建时间：2016年6月22日 下午8:50:00
 * @version 1.0 *
 * @since
 */
public class IdWorkerTest {
	static class IdWorkThread implements Runnable {
		private Set<Long> set;
		private IdWorker idWorker;

		public IdWorkThread(Set<Long> set, IdWorker idWorker) {
			this.set = set;
			this.idWorker = idWorker;
		}

		@Override
		public void run() {
			while (true) {
				long id = idWorker.nextId();
				if (!set.add(id)) {
					System.out.println("duplicate:" + id);
				}
			}
		}
	}

	public static void main(String[] args) {
		Set<Long> set = new HashSet<Long>();
		final IdWorker idWorker1 = new IdWorker(0, 0);
		final IdWorker idWorker2 = new IdWorker(1, 0);
		Thread t1 = new Thread(new IdWorkThread(set, idWorker1));
		Thread t2 = new Thread(new IdWorkThread(set, idWorker2));
		t1.setDaemon(true);
		t2.setDaemon(true);
		t1.start();
		t2.start();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
