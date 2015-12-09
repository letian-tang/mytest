package com.test.patterns.proxy.p1;

public class ProxyStar implements Star{
	
	private Star start;
	
	

	public ProxyStar(Star start) {
		super();
		this.start = start;
	}

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
		start.sing();
	}

	@Override
	public void weikun() {
		System.out.println("支付尾款");
		
	}

}
