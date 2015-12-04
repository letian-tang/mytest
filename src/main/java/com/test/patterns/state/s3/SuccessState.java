package com.test.patterns.state.s3;

/**
 * 确认订单
 * @author tdy
 *
 */
public class SuccessState implements OrderState{
	
	private ContextState contextState;
	

	public SuccessState(ContextState contextState) {
		super();
		this.contextState = contextState;
	}


	@Override
	public void cancel() {
		System.out.println("订单完成，不能取消");
		
	}

	@Override
	public void pay() {
		System.out.println("订单完成，不能支付");
		
	}

	@Override
	public void packaging() {
		System.out.println("订单完成，打包");
	}

	@Override
	public void stowage() {
		System.out.println("订单完成，不能装货");
		
	}

	@Override
	public void confirm() {
		System.out.println("订单已经完成");
		
	}
	
	
}
