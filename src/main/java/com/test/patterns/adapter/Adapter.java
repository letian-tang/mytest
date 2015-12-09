package com.test.patterns.adapter;

/**
 * 对象适配
 * 
 * @author tdy
 *
 */
public class Adapter implements Target {

	private Adaptee adaptee;

	public Adapter(Adaptee adaptee) {
		super();
		this.adaptee = adaptee;
	}

	public void handler() {
		adaptee.request();
	}

}
