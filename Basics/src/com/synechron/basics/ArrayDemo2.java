package com.synechron.basics;

public class ArrayDemo2 {
//Object of an array in the below method...
	public boolean isValuePresent(int value) {
		int a[] = new int[5];

		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * 100);
			if (i == value) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		ArrayDemo2 arrayDemo2 = new ArrayDemo2();
		boolean result = arrayDemo2.isValuePresent(200);
		System.out.println(result);
	}

}
