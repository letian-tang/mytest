package com.test.patterns.state.s3;

public class CreateState implements OrderState {
	
	private ContextState contextState;
	
	

	public CreateState(ContextState contextState) {
		super();
		this.contextState = contextState;
	}
	
	@Override
	public void create() {
		System.out.println("订单创建 ");
		contextState.setState(contextState.getPaySuccessState());
		
	}

	@Override
	public void cancel() {
		System.out.println("订单取消");
		contextState.setState(contextState.getCancelState());
	}

	@Override
	public void pay() {
		System.out.println("没有创建，不能支付");
	}
	

	@Override
	public void packaging() {
		System.out.println("没有创建，不能打包");

	}

	@Override
	public void stowage() {
		System.out.println("没有创建，不能装货");

	}

	@Override
	public void confirm() {
		System.out.println("没有创建，不能确认");
	}
	
	@Override
	public void finish() {
		System.out.println("没有创建，不能完成");
		
	}

}
