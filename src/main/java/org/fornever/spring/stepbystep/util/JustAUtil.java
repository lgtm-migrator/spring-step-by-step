package org.fornever.spring.stepbystep.util;

import org.springframework.stereotype.Component;

@Component
public class JustAUtil {

	/**
	 * Just add two integer
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public Integer add(Integer a, Integer b) {
		return a + b;
	}

}
