package com.test.patterns.state.s3;

/**
 * 支付成功
 * @author tdy
 *
 */
public class PaySuccessState implements OrderState{
	
	private ContextState contextState;
	
	

	public PaySuccessState(ContextState contextState) {
		super();
		this.contextState = contextState;
	}


	@Override
	public void cancel() {
		contextState.setState(contextState.getCancelState());
		System.out.println("订单已经取消");
		
	}

	@Override
	public void pay() {
		contextState.setState(contextState.getGoodsDistributionState());
		
	}

	@Override
	public void packaging() {
		System.out.println("支付中，不能打包");
		
	}

	@Override
	public void stowage() {
		System.out.println("支付中， 不能装货");
		
	}

	@Override
	public void confirm() {
		// TODO Auto-generated method stub
		
	}
	
}
