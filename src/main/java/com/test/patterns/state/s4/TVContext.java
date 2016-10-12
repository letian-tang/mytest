package com.test.patterns.state.s4;

/**
 * [简要描述]:<br/>
 * [详细描述]:<br/>
 * 
 * @author tangdingyi E-mail: 13913364179@163.com
 * @date 创建时间：2016年10月12日 下午3:05:50
 * @version 1.0 *
 * @since
 */
public class TVContext implements State {

	private State state;

	public void setState(State state) {
		this.state = state;
	}

	public State getState() {
		return state;
	}



	@Override
	public void handler(TVContext ct,Order order) {
		state.handler(ct,order);
	}

}
