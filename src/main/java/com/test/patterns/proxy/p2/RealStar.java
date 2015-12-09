package com.test.patterns.proxy.p2;

public class RealStar implements Star{

	@Override
	public void face() {
		System.out.println("面谈");
		
	}

	@Override
	public void hetong() {
		System.out.println("签合同");
		
	}

	@Override
	public void zhifu() {
		System.out.println("支付定金");
		
	}

	@Override
	public void sing() {
		System.out.println("周杰伦开唱");
		
	}

	@Override
	public void weikun() {
		System.out.println("支付尾款");
		
	}

}
