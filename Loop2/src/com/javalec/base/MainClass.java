package com.javalec.base;

public class MainClass {

	public static void main(String[] args) {
		// for
		
//		for (int j = 2; j < 10; j++) {
//			System.out.println(">>> " + j + "단 <<<");
//			for (int i = 1; i < 10; i++) {
//				System.out.println(j + " * " + i + " = " + (j*i));
//			}
//			System.out.println("-------------------------------");
//		}
		
		for (int j = 1; j < 10; j++) {			
			for (int i = 2; i < 10; i++) {
				System.out.print(String.format(i + " * " + j + " = %2d" +"\t", (i*j)));
			}
			System.out.println();
		}

		
		
		
		
		
		
		
		
		
	} //

} //
