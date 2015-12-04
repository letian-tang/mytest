package com.test.patterns.state.s3;

/**
 * 取消订单
 * @author tdy
 *
 */
public class CancelState implements OrderState{
	
	private ContextState contextState;

	public CancelState(ContextState contextState) {
		super();
		this.contextState = contextState;
	}
	
	@Override
	public void create() {
		System.out.println("-----------");
		
	}

	@Override
	public void cancel() {
		System.out.println("订单取消");
		contextState.setState(contextState.getCeateState());
		
	}

	@Override
	public void pay() {
		System.out.println("订单被取消，不能支付");
		
	}
	

	@Override
	public void packaging() {
		System.out.println("订单被取消，不能打包");
		
	}

	@Override
	public void stowage() {
		System.out.println("订单被取消，不能装货");
		
	}

	@Override
	public void confirm() {
		System.out.println("订单被取消，不能确认");
		
	}
	
	@Override
	public void finish() {
		System.out.println("订单被取消，不能完成");
		
	}
	
	
}
