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
	public void create() {
		System.out.println("商品出库中，不能重复创建 ");
		
	}

	@Override
	public void cancel() {
		System.out.println("商品出库中，不能取消");
		
	}

	@Override
	public void pay() {
		System.out.println("商品出库中，不能支付");
		
	}
	

	@Override
	public void packaging() {
		System.out.println("商品出库中，不能打包");
	}

	@Override
	public void stowage() {
		System.out.println("商品出库");
		contextState.setState(contextState.getDispatchingState());
	}

	@Override
	public void confirm() {
		System.out.println("商品出库中，不能确认");
		
	}
	
	@Override
	public void finish() {
		System.out.println("商品出库中,不能完成");
		
	}
	
	
}
