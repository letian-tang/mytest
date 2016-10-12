package com.test.patterns.state.s3;

public interface OrderState {
	
	//订单创建
	void create();
	
	//取消订单
	void cancel();
	
	//支付订单
	void pay();//
	
	//打包商品
    void packaging();
    
    //装货
    void stowage();
    
    //
    void confirm();
    
    //完成
    void finish();
	
}
