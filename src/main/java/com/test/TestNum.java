package com.test;

/**
 * [简要描述]:<br/>
 * [详细描述]:<br/>
 * 
 * @author tangdingyi E-mail: 13913364179@163.com
 * @date 创建时间：2016年6月19日 上午9:38:26
 * @version 1.0 *
 * @since
 */
public class TestNum {
	// ①通过匿名内部类覆盖ThreadLocal的initialValue()方法，指定初始值
	private static ThreadLocal<Integer> seqNum = new ThreadLocal<Integer>() {
		public Integer initialValue() {
			return 0;
		}
	};

	// ②获取下一个序列值
	public int getNextNum() {
		//System.out.println(seqNum);
		seqNum.set(seqNum.get() + 1);
		return seqNum.get();
	}

	public static void main(String[] args) {
		TestNum sn = new TestNum();
		// ③ 3个线程共享sn，各自产生序列号
		TestClient t1 = new TestClient(sn);
		TestClient t2 = new TestClient(sn);
		TestClient t3 = new TestClient(sn);
		t1.start();
		t2.start();
		t3.start();
	}

	private static class TestClient extends Thread {
		private TestNum sn;

		public TestClient(TestNum sn) {
			//System.out.println(sn);
			this.sn = sn;
		}

		public void run() {
			for (int i = 0; i < 3; i++) {
				// ④每个线程打出3个序列值
				System.out.println("thread[" + Thread.currentThread().getName() + "] --> sn[" + sn.getNextNum() + "]");
			}
		}
	}
}
