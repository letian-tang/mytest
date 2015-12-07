package com.test.patterns.builder.b2;

public class MobilePackage {
	
	private String name;
	
	private double fee;
	
	private int min;
	
	private int net;

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getNet() {
		return net;
	}

	public void setNet(int net) {
		this.net = net;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "MobilePackage [name=" + name + ", fee=" + fee + ", min=" + min + ", net=" + net + "]";
	}
	

}
