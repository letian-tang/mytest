package com.test.patterns.flyweight.f1;

public class FlavorOrder extends Order {
	private String flavor;

	public FlavorOrder(String flavor) {
		this.flavor = flavor;
	}

	public String getFlavor() {
		return this.flavor;
	}

	public void sell() {
		System.out.println("卖出一杯 [" + flavor + "]。");
	}
}
