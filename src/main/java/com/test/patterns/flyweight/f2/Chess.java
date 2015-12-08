package com.test.patterns.flyweight.f2;

public class Chess {
	
	private String color;
	
	public void display(Pointer pointer){
		System.out.println(pointer);
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Chess(String color) {
		super();
		this.color = color;
	}
	

}
