package com.test.patterns.chainofrespon.c2;

import java.util.ArrayList;
import java.util.List;

public class ActionInvocation {
	
	Action action = new Action();

	List<Interceptor> interceptors = new ArrayList<>();

	public ActionInvocation addInterceptors(Interceptor interceptor) {
		interceptors.add(interceptor);
		return this;
	}

	int index = 0;

	public void invoke() {
		
		if(index == interceptors.size()){
			action.execute();
			return;
		}
		
		Interceptor interceptor = interceptors.get(index);

		index++;

		interceptor.interceptor(this);

	}

}
