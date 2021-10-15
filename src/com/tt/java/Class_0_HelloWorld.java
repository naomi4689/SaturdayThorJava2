package com.tt.java;

public class Class_0_HelloWorld {

	static Class_0_HelloWorld myObj = new Class_0_HelloWorld();

	public static int income = 120000;
	private static String city = "Austin";
	protected static boolean isNy = false;

	public static void main(String[] args) {
		akon();
		myObj.rubayyah();
		System.out.println(safi());
	}

	public static void akon() {
		income = 135000;
		city = "Saint Luis";
		isNy = false;
		System.out.println("Akon income is :" + income + " He lives in : " + city + " is it on NY State : " + isNy);
	}

	public void rubayyah() {
		income = 120000;
		city = "Farmingville";
		isNy = true;
		System.out.println("Rubayyah income is :" + income + " He lives in : " + city + " is it on NY State : " + isNy);
	}

	public static String safi() {
		income = 135000;
		city = "Prospect Park";
		isNy = false;
		return "I am a SDET";
	}

}
