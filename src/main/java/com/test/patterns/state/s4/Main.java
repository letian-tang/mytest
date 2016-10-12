package com.test.patterns.state.s4;

/**
 * [简要描述]:<br/>
 * [详细描述]:<br/>
 * 
 * @author tangdingyi E-mail: 13913364179@163.com
 * @date 创建时间：2016年10月12日 下午3:06:34
 * @version 1.0 *
 * @since
 */
public class Main {

	TVContext context = new TVContext();
	State tvStartState = new TVStartState();
	State tvStopState = new TVStopState();

	public void ss() {
		context.setState(tvStartState);
		context.handler(context,new Order(1));
		
		context.setState(tvStopState);
		context.handler(context,new Order(1));
	}

	public static void main(String[] args) {
		Main main = new Main();
		for (int i = 0; i < 1000; i++) {
			new Thread(() -> {
				main.ss();
				try {
					Thread.sleep(1);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}).start();
		}

	}

}
