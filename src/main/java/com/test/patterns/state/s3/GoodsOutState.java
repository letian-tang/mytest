package com.test.patterns.state.s3;

/**
 * 商品出库
 * @author tdy
 *
 */
public class GoodsOutState implements OrderState{
	
	private ContextState contextState;
	
	

	public GoodsOutState(ContextState contextState) {
		super();
		this.contextState = contextState;
	}

	@Override
	public void submit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cancel() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pay() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void packaging() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stowage() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void confirm() {
		// TODO Auto-generated method stub
		
	}
	
	
}
