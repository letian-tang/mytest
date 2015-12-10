package com.test.patterns.chainofrespon.c1;

public class Client {
	
	public static void main(String[] args) {
		
		FilterChain chain = new FilterChain();
		chain.addFilter(new Filter1()).addFilter(new Filter2()).addFilter(new Filter3());
		Request request  = new Request();
		request.setRequestStr("阿斯蒂芬");
		Response response = new Response();
		chain.doFilter(request, response, chain);
		
		System.out.println(request.getRequestStr());
		System.out.println(response.getResponseStr());
	}

}
