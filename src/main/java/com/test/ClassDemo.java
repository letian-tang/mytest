package com.test;

/**
 * [简要描述]:<br/>
 * [详细描述]:<br/>
 * 
 * @author tangdingyi E-mail: 13913364179@163.com
 * @date 创建时间：2016年7月20日 下午3:51:59
 * @version 1.0 *
 * @since
 */
class A {
	public static void show() {
		System.out.println("Class A show() function");
	}
}

class B extends A {
	public static void show() {
		System.out.println("Class B show() function");
	}
}

public class ClassDemo {

	public static void main(String[] args) {

		ClassDemo cls = new ClassDemo();
		Class c = cls.getClass();
		System.out.println(c);

		Object obj = new A();
		B b1 = new B();
		b1.show();

		// casts object
		Object a = A.class.cast(b1);
		
		Object sss = A.class.cast(obj);
		

		System.out.println(obj.getClass());
		System.out.println(b1.getClass());
		System.out.println(a.getClass());
		
		
		System.out.println(sss.getClass());
		
		
	}
}