package com.test.patterns.state.s4;

/**
 * [简要描述]:<br/>
 * [详细描述]:<br/>
 * 
 * @author tangdingyi E-mail: 13913364179@163.com
 * @date 创建时间：2016年10月12日 下午3:04:28
 * @version 1.0 *
 * @since
 */
public interface State {
	void handler(TVContext ct,Order order);
}
