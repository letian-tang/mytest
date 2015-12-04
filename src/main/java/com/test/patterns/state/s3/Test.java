package com.test.patterns.state.s3;

public class Test {

	public static void main(String[] args) {
		ContextState context = new ContextState();
		
		context.create();
		
		context.pay();
		
		context.packaging();
		
	    context.stowage();
		
		context.confirm();
		
		context.finish();

	}

}
