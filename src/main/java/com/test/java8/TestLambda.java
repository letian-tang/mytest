package com.test.java8;

/**
 * lambda表示调用和置换
 * @author tdy
 *
 *lambda语法3部分
 *1：参数列表
 *2：箭头符合'->'
 *3: 代码块
 */
public class TestLambda {
	
	public static void main(String[] args) {
		new Runnable() {
			public void run() {
				System.out.println("dddddddddd");
			}
		}.run();
		int i = 1;
		Runnable r =()->{
			System.out.println("lambda ddddddddddd");
		    System.out.println("ddd"+i);
		};
		r.run();
		
		new Thread(() -> System.out.println("这是一个java8的小例子,可以使用lambda表达式")).start();
		
	}

}
