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
	public void create() {
		System.out.println("商品配货中，不能重复创建 ");
		
	}

	@Override
	public void cancel() {
		System.out.println("商品配货中，不能取消");
		
	}

	@Override
	public void pay() {
		System.out.println("商品配货中，不能支付");
		
	}
	

	@Override
	public void packaging() {
		System.out.println("等待配货");
		contextState.setState(contextState.getGoodsOutState());
		
	}

	@Override
	public void stowage() {
		
		System.out.println("商品配货中，不能装货");
	}

	@Override
	public void confirm() {
		System.out.println("商品配货中，不能确认");
	}
	
	@Override
	public void finish() {
		System.out.println("商品配货中, 不能完成");
		
	}
	
	
}
