package com.test.patterns.flyweight.f2;

import java.util.HashMap;
import java.util.Map;

public class Flyweight { 
	
	private Map<String,Chess> flyWeightPool = new HashMap<>();
	
	private static Flyweight flyweight = new Flyweight();
	
	private Flyweight(){
		
	}
	
	public static Flyweight getInstance(){
		return flyweight;
	}
	
	public Chess getChess(String color){
		if(null == flyWeightPool.get(color)){
			flyWeightPool.put(color, new Chess(color));
		}
		
		return flyWeightPool.get(color);
	}

}
