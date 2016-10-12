package com.test.patterns.state.s1;

public class Client {

	public static void main(String[] args) {
		
		Context cont = new Context();
		System.out.println("-------状态改变-------");
		//cont.setState(new SubmitOrders());
		cont.setState(new PaymentSuccess());
		cont.setState(new CommodityDistribution());
		cont.setState(new GoodsOut());
		cont.setState(new WaitingToReceive());
		cont.setState(new Finish());
	}

}
