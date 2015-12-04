package com.test.patterns.state.s3;

public class Test {

	public static void main(String[] args) {
		ContextState context = new ContextState();
		
		//context.cancel();
		
		context.pay();
		
		context.packaging();
		
		context.stowage();
		
		context.confirm();

	}

}
