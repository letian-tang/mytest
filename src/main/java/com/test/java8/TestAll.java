package com.test.java8;

public class TestAll {
	
	/**
	 * 1：接口的默认方法   default标识
	 * @author tdy
	 *
	 */
	interface MyInterface{
		void m1();
		
		//1：接口的默认方法   default标识
		default void m2(){
			System.out.println(2);
		}
	}
	
	//3：函数式接口 @FunctionalInterface 
	@FunctionalInterface
	interface MyInterface2{
		void m1();
		
		default void m2(){
			System.out.println(2);
		}
		
		String toString();
	}
	
	@FunctionalInterface
	interface Converter<F, T> {
	    T convert(F from);
	}
	
	
	public static void main(String[] args) {
		//2：Lambda 表达式
		new Thread(()->{System.out.println("Lambda 表达式");}).start();
		
		MyInterface2 tt = ()->{
			System.out.println("dddddddddddd");
		};
		tt.m1();
		tt.m2();
		
		
		//4：方法与构造函数引用
		Converter<String, Integer> converter = Integer::valueOf;
		Integer converted = converter.convert("123");
		System.out.println(converted);   // 123
	}

}
