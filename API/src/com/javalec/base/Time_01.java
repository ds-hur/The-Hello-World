package com.javalec.base;

public class Time_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "a";
		
		long startTime = System.currentTimeMillis();
		for (int i = 1; i <= 50000; i++) {
			str += "a";
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Term : " + (endTime - startTime));
		
		
		StringBuilder stringBuilder = new StringBuilder("a");
		long startTime1 = System.currentTimeMillis();
		for (int i = 1; i <= 50000; i++) {
			stringBuilder = stringBuilder.append("a");
		}
		long endTime1 = System.currentTimeMillis();
		System.out.println("Term : " + (endTime1 - startTime1));
		

		
		
		
		
		
		
		
		
		
	} //

} //
