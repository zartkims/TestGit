package com.cpl.learn;

import org.junit.Test;

public class ThisProjectOnlyForLearn {
	@Test
	public void testSort() {
		int [] a = getRandomNums(30);
	}
	
	public int[] getRandomNums(int len) {
		int [] a = new int [len];
		for (int i = 0; i < len; i++) a[i] = i;
		for (int i = 0 ; i < len; i++) {
			int random = (int) (Math.random() * len);
			int t = a[i];
			a[i] = a[random];
			a[random] = t;
		}
		return a;
	}
}
