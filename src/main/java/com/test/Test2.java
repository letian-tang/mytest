package com.test;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * [简要描述]:<br/>
 * [详细描述]:<br/>
 * 
 * @author tangdingyi E-mail: 13913364179@163.com
 * @date 创建时间：2016年5月31日 上午11:15:28
 * @version 1.0 *
 * @since
 */
class Te implements Runnable{
	
	private CountDownLatch countDownLatch;
	
	private int NO;
	
	public Te (CountDownLatch countDownLatch,int no){
		this.countDownLatch = countDownLatch;
		this.NO = no;
	}

	@Override
	public void run() {
		try {
			Thread.sleep((long) (Math.random() * 10000));
			System.out.println("No." + NO + " arrived");
		} catch (InterruptedException e) {
		} finally {
			// 每个选手到达终点时，end就减一
			countDownLatch.countDown();
		}
	}
	
}
public class Test2 {
	
	
	

	public static void main(String[] args) throws InterruptedException {


		// 结束的倒数锁
		final CountDownLatch countDownLatch = new CountDownLatch(10);

		// 十名选手
		final ExecutorService exec = Executors.newFixedThreadPool(10);
		
		new Thread(()->{
			for (int index = 0; index < 10; index++) {
				final int NO = index + 1;
				exec.submit(new Te(countDownLatch,NO));
			}
			try {
				countDownLatch.await();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("Game Over");
			exec.shutdown();
		}).start();

		
	}
}
