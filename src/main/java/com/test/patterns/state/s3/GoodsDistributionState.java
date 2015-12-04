package com.test.patterns.state.s3;

/**
 * 商品配货
 * @author tdy
 *
 */
public class GoodsDistributionState implements OrderState {
	
	private ContextState contextState;
	
	

	public GoodsDistributionState(ContextState contextState) {
		super();
		this.contextState = contextState;
	}


	@Override
	public void cancel() {
		System.out.println("配货中，不能取消");
		
	}

	@Override
	public void pay() {
		System.out.println("已经支付，无需再支付");
		
	}

	@Override
	public void packaging() {
		System.out.println("已经配货，无需再配货");
		
	}

	@Override
	public void stowage() {
		contextState.setState(contextState.getGoodsDistributionState());
	}

	@Override
	public void confirm() {
		// TODO Auto-generated method stub
		
	}
	
	
}
