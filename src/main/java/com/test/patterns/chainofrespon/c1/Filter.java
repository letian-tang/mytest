package com.test.patterns.chainofrespon.c1;

public interface Filter {

	void doFilter(Request request,Response response,FilterChain filterChain);
}
