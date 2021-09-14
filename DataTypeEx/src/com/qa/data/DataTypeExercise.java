package com.qa.data;

public class DataTypeExercise {

	public static float decimalF = 3.2f;
	public static int number = 9;
	public static String str = "Richard";

	public static int intMethod(int i) {
		return i;
	}

	public static void printAll() {
		System.out.println("Your string is: " + str + ", your float is: " + decimalF + ", your int is: " + number);
	}

}
