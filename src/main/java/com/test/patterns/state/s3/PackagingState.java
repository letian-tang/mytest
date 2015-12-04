package com.test.patterns.state.s3;
/**
 * 商品打包
 * @author tdy
 *
 */
public class PackagingState implements OrderState {
	
	private ContextState contextState;
	
	

	public PackagingState(ContextState contextState) {
		super();
		this.contextState = contextState;
	}


	@Override
	public void cancel() {
		System.out.println("打包中，不能取消");
		
	}

	@Override
	public void pay() {
		System.out.println("已经支付，无需再支付");
		
	}

	@Override
	public void packaging() {
		contextState.setState(contextState.getGoodsDistributionState());
		
	}

	@Override
	public void stowage() {
		System.out.println("打包中， 不能装货");
		
	}

	@Override
	public void confirm() {
		
	}
	
}
