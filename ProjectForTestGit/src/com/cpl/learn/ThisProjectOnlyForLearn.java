package com.cpl.learn;

import java.util.Arrays;

import org.junit.Test;

public class ThisProjectOnlyForLearn {
	@Test
	public void testSort() {
		int [] a = getRandomNums(30);
//		Arrays.sort(a);
		insertSort(a);
		for (int i : a) System.out.print(i + " ");
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
	
	public void insertSort(int [] a) {
		if (a == null || a.length < 2) return;
		for (int i  = 1; i < a.length; i++) {
			if (a[i] < a[i - 1]) {
				int stand = a[i];
				int j = i - 1;
				while (j >= 0 && a[j] > stand) {
					a[j + 1] = a[j];
					j--;
				}
				a[++j] = stand;
			}
		}
	}
}
