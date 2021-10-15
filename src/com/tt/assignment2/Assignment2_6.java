package com.tt.assignment2;

public class Assignment2_6 {

	public static void main(String[] args) {
		// 6.	Write a java program to find the prime number from 1 to 100 and print them.

		
	boolean isPrime = true;
	for(int n1 = 1; n1 <= 100; n1++) {
		
		for(int n2 = 2; n2 <= n1/2; ++n2) {
			if(n1 % n2 ==0) {
				isPrime = false;
				break;
			}
			else
				isPrime = true;
		}
		if(isPrime)
			System.out.println(n1 + " is a prime number.");
		else
			System.out.println(n1 + " is not a prime number");
	}
	
	}
}
