package com.test.patterns.proxy.p2;

import java.lang.reflect.Proxy;

public class Client {
	
	public static void main(String[] args) {
		Star star = new RealStar();
		StarHandler handler = new StarHandler(star);
		
		Star proxy = (Star) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Star.class}, handler);
		
		proxy.sing();
	}

}
