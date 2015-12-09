package com.test.patterns.decorator;

public class FlyCar extends SuperCar {

	public FlyCar(ICar car) {
		super(car);
	}

	public void move1() {
		System.out.println("天上飞");
	}

	@Override
	public void move() {
		car.move();
		move1();

	}

}
