package com.test.patterns.state.s4;

/**
 * [简要描述]:<br/>
 * [详细描述]:<br/>
 * 
 * @author tangdingyi E-mail: 13913364179@163.com
 * @date 创建时间：2016年10月12日 下午3:39:42
 * @version 1.0 *
 * @since
 */
public class Order {

	private int state;

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public Order(int state) {
		super();
		this.state = state;
	}

}
