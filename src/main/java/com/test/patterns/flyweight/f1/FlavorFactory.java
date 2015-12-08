package com.test.patterns.flyweight.f1;

import java.util.HashMap;
import java.util.Map;

public class FlavorFactory {
	// 订单池
	private Map<String, Order> flavorPool = new HashMap<String, Order>(20);
	// 静态工厂,负责生成订单对象
	private static FlavorFactory flavorFactory = new FlavorFactory();

	private FlavorFactory() {
	}

	public static FlavorFactory getInstance() {
		return flavorFactory;
	}

	// 获得订单
	public Order getOrder(String flavor) {
		Order order = null;
		if (flavorPool.containsKey(flavor)) {
			order = flavorPool.get(flavor);
		} else {
			// 获得新口味订单
			order = new FlavorOrder(flavor);
			// 放入对象池
			flavorPool.put(flavor, order);
		}
		return order;
	}

	// 获得已经卖出的咖啡全部口味数量
	public int getTotalFlavorsMade() {
		return flavorPool.size();
	}	

}
