package com.test.patterns.state.s4;
/** 
* [简要描述]:<br/>
* [详细描述]:<br/>
* @author  tangdingyi  E-mail: 13913364179@163.com
* @date 创建时间：2016年10月12日 下午3:04:45 
* @version 1.0 *
* @since  
*/
public class TVStartState implements State {

	@Override
	public void handler(TVContext ct,Order order) {
        System.out.println("TVStartState".equals(ct.getState().getClass().getSimpleName()));	
		System.out.println("TVStartState="+ct.getState().getClass().getSimpleName());	
	}
}
