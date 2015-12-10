package com.test.patterns.chainofrespon.c2;

public class InterceptorImpl2 implements Interceptor {

	@Override
	public void interceptor(ActionInvocation invocation) {
           System.out.println("interceptor2   之前处理");
           invocation.invoke();
           System.out.println("interceptor2   之后处理");
	}

}
