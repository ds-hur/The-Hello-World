package com.javalec.base;

public class Calc {

	public static void main(String[] args) {
		// 연산자 종류별 출력
		int i = 10 ;
		int j = 2 ;
		int k = 5 ;
		
		System.out.println("<-- 산술 연산자 -->");
		System.out.println("덧셈 : " + i + " + " + j + " = " + (i+j));
		System.out.println("뺄셈 : " + i + " - " + j + " = " + (i-j));
		System.out.println("곱셈 : " + i + " * " + j + " = " + (i*j));
		System.out.println("나눗셈 : " + i + " / " + j + " = " + (i/j));
		System.out.println("나머지 : " + i + " % " + j + " = " + (i%j));
		
		

	}

}
