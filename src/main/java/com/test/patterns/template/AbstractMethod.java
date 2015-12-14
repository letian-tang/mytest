package com.test.patterns.template;

public abstract class AbstractMethod {

	public void m4() {
		System.out.println("起床");
	}

	public abstract void m1();

	public abstract void m2();

	public void m5() {
		System.out.println("到单位");
	}

	public void m3() {
		m4();
		m1();
		m2();
		m5();
	}

}
