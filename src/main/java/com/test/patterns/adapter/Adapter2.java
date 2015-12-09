package com.test.patterns.adapter;

/**
 * 类适配
 * @author tdy
 *
 */
public class Adapter2 extends Adaptee implements Target{
	
	public void  handler(){
		request();
	}

}
