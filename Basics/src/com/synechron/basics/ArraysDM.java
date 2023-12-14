package com.synechron.basics;

import java.util.Arrays;

public class ArraysDM {
	
	int a[] = {1,20,25,30,45,50,70};
	
	public boolean search(int value) {
		
		for (int i : a) {
			if(i==value) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		ArraysDM arrayDSDemo = new ArraysDM();
		boolean result = arrayDSDemo.search(30);
		
		System.out.println("result ="+result);
		
		byte byteArr[] = { 10, 20, 15, 22, 35 };
        char charArr[] = { 'g', 'p', 'q', 'c', 'i' };
        int intArr[] = { 10, 20, 15, 22, 35 };
        double doubleArr[] = { 10.2, 15.1, 2.2, 3.5 };
        float floatArr[] = { 10.2f, 15.1f, 2.2f, 3.5f };
        short shortArr[] = { 10, 20, 15, 22, 35 };
        
        // sorted data
        Arrays.sort(byteArr);
        Arrays.sort(charArr);
        Arrays.sort(intArr);
        Arrays.sort(floatArr);
        Arrays.sort(shortArr);
        
        System.out.println(Arrays.toString(byteArr));
        

        byte byteKey=35;
        char charKey = 'g';
        int intKey = 22;
        double doubleKey = 1.5;
        float floatKey = 35;
        short shortKey = 5;
        
        System.out.println("byteKey found @ index " +Arrays.binarySearch(byteArr, byteKey));
        System.out.println("charKey found @ index " +Arrays.binarySearch(charArr, charKey));
        System.out.println("intKey found @ index " +Arrays.binarySearch(intArr, intKey));
        System.out.println("doubleKey found @ index " +Arrays.binarySearch(doubleArr, doubleKey));
        System.out.println("floatKey found @ index " +Arrays.binarySearch(floatArr, floatKey));
        System.out.println("shortKey found @ index " +Arrays.binarySearch(shortArr, shortKey));
        
        
        
        
        
	
	}

}