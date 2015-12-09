package com.test.patterns.decorator;

public class SuperCar implements ICar {

	protected ICar car;

	@Override
	public void move() {
		car.move();

	}

	public SuperCar(ICar car) {
		super();
		this.car = car;
	}

}
