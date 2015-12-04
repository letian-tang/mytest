package com.test.patterns.state.s3;

/**
 * 商品配送
 * @author tdy
 *
 */
public class DispatchingState implements OrderState{
	
	private ContextState contextState;
	
	

	public DispatchingState(ContextState contextState) {
		super();
		this.contextState = contextState;
	}

	@Override
	public void cancel() {
		System.out.println("配送中，不能取消");
		
	}

	@Override
	public void pay() {
		System.out.println("已经支付，无需再支付");
		
	}

	@Override
	public void packaging() {
		System.out.println("已经打包，无需再打包");
		
	}

	@Override
	public void stowage() {
		System.out.println("已经配货，配货再配货");
		
	}

	@Override
	public void confirm() {
		contextState.setState(contextState.getSuccessState());
		System.out.println("已确认，成功收货");
		
	}
	
	
}
