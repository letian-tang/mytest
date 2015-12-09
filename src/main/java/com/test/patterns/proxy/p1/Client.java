package com.test.patterns.proxy.p1;

public class Client {
	
	
	public static void main(String[] args) {
		Star realStar = new RealStar();
		Star proxyStar = new ProxyStar(realStar);
		
		proxyStar.sing();
	}

}
