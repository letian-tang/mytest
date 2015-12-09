package com.test.patterns.decorator;

public class Client {

	public static void main(String[] args) {
		
		ICar car = new Car();
		car.move();
		
		
		System.out.println("-------------------");
		
		WaterCar waterCar = new WaterCar(new FlyCar(car));
		waterCar.move();

	}

}
