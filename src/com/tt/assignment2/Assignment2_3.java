package com.tt.assignment2;

public class Assignment2_3 {

			// 3.	Write two java functions which will return two different integer values, write a program to compare those numbers and send message that one number is bigger than other. 
		
		public static int a;
		public static int b;
		
		public static void main(String[] args) {
			a = myFunction1();
			b = myFunction2();
			myMethod();	
		}
		
		
		public static int myFunction1(){
			return 20;
		}
		public static int myFunction2(){
			return 10;
		}
		public static void myMethod(){
			if (a>b){
				System.out.println( "First function is bigger than second function");}
			if (a<b){
				System.out.println( "Second function is bigger than first function");}
			}
		
}
