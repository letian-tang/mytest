package com.test.patterns.decorator;

public class WaterCar extends SuperCar {

	public WaterCar(ICar car) {
		super(car);
	}

	public void move1() {
		System.out.println("水上走");
	}

	@Override
	public void move() {
		car.move();
		move1();
	}

}
