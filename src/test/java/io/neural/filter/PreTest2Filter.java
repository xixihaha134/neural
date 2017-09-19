package io.neural.filter;

import io.neural.Message;
import io.neural.extension.Extension;

@Extension(category = FilterChain.PRE, order = 3)
public class PreTest2Filter extends Filter<Message> {
	
	@Override
	public void doFilter(Chain<Message> chain, Message m) throws Exception {
		System.out.println(this.getClass().getName());
		chain.doFilter(chain, m);
	}

}
