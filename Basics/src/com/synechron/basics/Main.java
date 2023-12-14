package com.synechron.basics;

public class Main {
	
	
	public static void main(String[] args) {
		
		int a[] = new int[50];
		// we will use it when we want to manipulate the data
		// on the basis of index.
		for (int i = 0; i < a.length; i++) {
			a[i]= (int) (Math.random()*100);
		}
		//Returns a double value with a positive sign, 
		//greater than or equal to 0.0 and less than 1.0.
		
		// when we want to print the array content then 
		// we should use forEACH loop
		for (int i : a) {
			System.out.println(i);
		}
		
		//short task- take numbers from array and divide by 3 & 7
		for(int number : a) {
			if(number % 3 == 0 && number % 7 == 0) {
				System.out.println("Divisable");
			}
		}
		//0 to 255 each ip address has a range of 0 to 255
		//Based on value from 1st cell, we need to return the class of ip
		String ip = "192.168.1.1";
		
		String s[] = ip.split("\\.");
		
		for(String value : s) {
			int cellValue = Integer.parseInt(value);
			
		if(cellValue >=0 && cellValue <=255) {
			System.out.println(value);
		}
		else {
			System.out.println("ip is not valid");
			System.exit(1);
		}
		}
		
		//class of ip - second constraint of the above task
		int cellOneValue = Integer.parseInt(s[0]);
		if(cellOneValue >= 1 && cellOneValue <=126 ) {
			System.out.println("ip belongs to class A");
		}
		else if(cellOneValue >=128 && cellOneValue <= 191) {
			System.out.println("ip belongs to class B");
		}
		else if(cellOneValue >= 192 && cellOneValue <= 223) {
			System.out.println("Ip belongs to class C");
		}
		else if (cellOneValue >= 224 && cellOneValue <= 239) {
			System.out.println("ip belongs to class d");
		}else if (cellOneValue >= 240 && cellOneValue <= 254) {
			System.out.println("ip belongs to class e");
		
		}
		else {
			System.out.println("Out of range ");
		}
		
		//write code to search an element in an array
		//input: array
		//criteria: if value ==a[i]. 
		//o/p present or not.
		
		
		
	}

}
	