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
	public void create() {
		System.out.println("配送中，不能重复创建 ");
		
	}

	@Override
	public void cancel() {
		System.out.println("配送中，不能取消");
		
	}

	@Override
	public void pay() {
		System.out.println("配送中，不能支付");
		
	}

	@Override
	public void packaging() {
		System.out.println("配送中，不能打包");
		
	}

	@Override
	public void stowage() {
		System.out.println("配送中，不能配货");
		
	}

	@Override
	public void confirm() {
		System.out.println("商品配送");
		contextState.setState(contextState.getSuccessState());
	}
	
	@Override
	public void finish() {
		System.out.println("配送中,请确认后，再完成");
		
	}
	
	
}
