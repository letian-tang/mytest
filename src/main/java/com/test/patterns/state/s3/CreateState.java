package com.test.patterns.state.s3;

public class CreateState implements OrderState {
	
	private ContextState contextState;
	
	

	public CreateState(ContextState contextState) {
		super();
		this.contextState = contextState;
	}

	@Override
	public void cancel() {
		contextState.setState(contextState.getCancelState());
		System.out.println("订单取消");

	}

	@Override
	public void pay() {
		contextState.setState(contextState.getPaySuccessState());
		System.out.println("支付成功");

	}

	@Override
	public void packaging() {
		System.out.println("还没有支付成功");

	}

	@Override
	public void stowage() {
		System.out.println("还没有支付成功");

	}

	@Override
	public void confirm() {
		System.out.println("还没有支付成功");

	}

}
