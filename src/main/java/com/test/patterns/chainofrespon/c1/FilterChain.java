package com.test.patterns.chainofrespon.c1;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author tdy
 *
 */
public class FilterChain implements Filter {
	List<Filter> filters = new ArrayList<>();

	public FilterChain addFilter(Filter filter) {
		filters.add(filter);
		return this;
	}

	int index = 0;

	@Override
	public void doFilter(Request request, Response response, FilterChain filterChain) {

		if (index == filters.size()) {
			return;
		}
		Filter f = filters.get(index);
		index++;
		f.doFilter(request, response, filterChain);

	}

}
