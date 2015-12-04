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
	public void create() {
		System.out.println("配送中，不能重复创建 ");
		
	}

	@Override
	public void cancel() {
		System.out.println("订单已确认，不能取消");
		
	}

	@Override
	public void pay() {
		System.out.println("订单已确认，不能支付");
		
	}
	

	@Override
	public void packaging() {
		System.out.println("订单已确认，不能打包");
	}

	@Override
	public void stowage() {
		System.out.println("订单已确认，不能装货");
		
	}

	@Override
	public void confirm() {
		System.out.println("订单已确认，不能在确认");
		
	}
	
	@Override
	public void finish() {
		System.out.println("订单完成");
	}
	
	
}
