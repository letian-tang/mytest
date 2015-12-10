package com.test.patterns.chainofrespon.c2;

public class Client {

	public static void main(String[] args) {
		ActionInvocation actionInvocation = new ActionInvocation();
		
		actionInvocation.addInterceptors(new InterceptorImpl()).addInterceptors(new InterceptorImpl2());
		
		actionInvocation.invoke();
	}
}
