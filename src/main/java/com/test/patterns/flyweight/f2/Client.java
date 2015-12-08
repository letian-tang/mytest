package com.test.patterns.flyweight.f2;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		
		List<Chess> chesses = new ArrayList<>();
		
		Chess chess1 = Flyweight.getInstance().getChess("黑色");
		chess1.display(new Pointer(10, 10));
		
		Chess chess2 = Flyweight.getInstance().getChess("黑色");
		chess2.display(new Pointer(20, 20));
		
		Chess chess3 = Flyweight.getInstance().getChess("白色");
		chess3.display(new Pointer(30, 30));
		
		Chess chess4 = Flyweight.getInstance().getChess("白色");
		chess4.display(new Pointer(40, 40));
		

	}

}
