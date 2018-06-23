package com.cpl.learn;

import java.util.Arrays;

import org.junit.Test;

public class ThisProjectOnlyForLearn {
	@Test
	public void testSort() {
		int [] a = getRandomNums(30);

//		Arrays.sort(a);
//		insertSort(a);
		quickSort(a, 0, a.length - 1);
//		Arrays.sort(a);

		for (int i : a) System.out.print(i + " ");
	}
	
	private int quickSort(int [] a, int low, int high) {
		if (low >= high) return low;
		int point = low;
		int stand = low + (int)Math.random() * (high - low);
		int t = a[stand];
		a[stand] = a[low];
		a[low] = t;
		stand = a[low];
		for (int i = low + 1; i <= high; i++) {
			if (a[i] < stand) {
				point++;
				if (point != i) {
					int temp = a[point];
					a[point] = a[i];
					a[i] = temp;
				}
			}
		}
		a[low] = a[point];
		a[point] = stand;
		quickSort(a, low, stand - 1);
		quickSort(a, stand + 1, high);
		return point;
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
