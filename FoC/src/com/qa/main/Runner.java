package com.qa.main;

public class Runner {

	public static String msg = "message";

	public static void first() {
		System.out.println("First");
		System.out.println(msg);
	}

	public static void second() {
		System.out.println("Second");
	}

	public static void third() {
		String str = "check";

		System.out.println(str);
	}

	public static void main(String[] abc) {
		third();
		second();
		first();
		String check = msg;
		System.out.println(msg);

		for (int i = 0; i < abc.length; i++) {
			System.out.println(i); 
		}
	}
	
	
	
	

}