package com.tt.java;

public class Class_2_IfElseStatement {

	public static void main(String[] args) {
		// If Else Statement
		
		int age = 101;
		
		if (age <13) {
			System.out.println("You are Children");
		} else if (age >13 && age <18){
			System.out.println("You are Teenage");
		} else if (age > 60){
			//Nested if Else Statement
			if (age > 100){
				System.out.println("You are Hero");
			} else {
				System.out.println("You are Senior");
			}
		} else {
			System.out.println("You are Adult");
		}

	}

}
