package com.test.patterns.state.s3;

public interface OrderState {
	
	//提交订单
	default void submit(){
		System.out.println("订单提交开始状态。。。。");
	}
	
	//取消订单
	void cancel();
	
	//支付订单
	void pay();
	
	//打包商品
    void packaging();
    
    //装货
    void stowage();
    
    //确认
    void confirm();
	
}
