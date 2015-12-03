package com.test.patterns.state;

public interface State {
	/**
	 * 
	1提交订单
	2付款成功
	3商品配货
	4商品出库
	5等待收货
	6完成
	 */
	void handler();

}
