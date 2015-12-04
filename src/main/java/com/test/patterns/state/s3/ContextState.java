package com.test.patterns.state.s3;

public class ContextState {

	// 订单创建
	private OrderState ceateState;
	// 订单取消
	private OrderState cancelState;
	// 付款成功
	private OrderState paySuccessState;
	// 等待配货
	private OrderState goodsDistributionState;
	// 商品出库
	private OrderState goodsOutState;
	// 商品配送
	private OrderState dispatchingState;
	// 成功
	private OrderState successState;

	private OrderState state;

	public void setState(OrderState state) {
		this.state = state;
	}

	public ContextState() {
		ceateState = new CreateState(this);
		cancelState = new CancelState(this);
		paySuccessState = new PaySuccessState(this);
		goodsDistributionState = new GoodsDistributionState(this);
		goodsOutState = new GoodsOutState(this);
		dispatchingState = new DispatchingState(this);
		successState = new SuccessState(this);
		this.state = ceateState;
	}
	
	public void create() {
		state.create();
	}

	public void cancel() {
		state.cancel();
	}

	public void pay() {
		state.pay();
	}

	public void packaging() {
		state.packaging();
	}

	public void stowage() {
		state.stowage();
	}

	public void confirm() {
		state.confirm();
	}
	
	public void finish() {
		state.finish();
	}

	// -------------------------------------------
	public OrderState getState() {
		return state;
	}

	public OrderState getCeateState() {
		return ceateState;
	}

	public OrderState getCancelState() {
		return cancelState;
	}

	public OrderState getPaySuccessState() {
		return paySuccessState;
	}

	public OrderState getGoodsDistributionState() {
		return goodsDistributionState;
	}

	public OrderState getGoodsOutState() {
		return goodsOutState;
	}

	public OrderState getDispatchingState() {
		return dispatchingState;
	}

	public OrderState getSuccessState() {
		return successState;
	}

}
