package com.test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * [简要描述]:<br/>
 * [详细描述]:<br/>
 * 
 * @author tangdingyi E-mail: 13913364179@163.com
 * @date 创建时间：2016年6月3日 下午10:16:10
 * @version 1.0 *
 * @since
 */
public class MethodOver {
	public static void main(String[] args) {
		Executor executor = Executors.newSingleThreadExecutor();
		FutureTask<String> future = new FutureTask<String>(new Callable<String>() {
			public String call() throws Exception {
				// TODO Auto-generated method stub
				MethodOver m = new MethodOver();
				return m.getValue();
			}
		});
		executor.execute(future);
		try {
			String result = future.get(1, TimeUnit.SECONDS);
			System.out.println(result);
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println("方法执行中断");
			// future.cancel(true);
		} catch (ExecutionException e) {
			System.out.println("Excution异常");
			// TODO: handle exception
			future.cancel(true);
		} catch (TimeoutException e) {
			// TODO: handle exception
			System.out.println("方法执行时间超时");
			// future.cancel(true);
		}
		System.out.println("sas");
	}

	public String getValue() {
		try {
			Thread.sleep(1500);
		} catch (Exception e) {
			e.printStackTrace();// TODO: handle exception
		}
		return "ssssssssssssssss";
	}
}
