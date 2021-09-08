package com.javalec.base;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Scanner scanner = new Scanner(System.in);
//		int inputValue = 0; // 사용자가 입력하는 숫자
//		int calcValue = 0; // 입력숫자 계산용 복사본, 계산시 몫으로 사용
//		int remainder = 0; // 계산시 나머지 값을 넣을 곳
//		int sum = 0; // 합계 구하는 변수
//		
//		System.out.print("Enter an integer(0~9) : ");
//		inputValue = scanner.nextInt();
//		calcValue = inputValue;
//		
//		while(calcValue != 0) {
//			remainder = calcValue % 10;
//			sum += remainder;
//			calcValue /= 10;
//			
////			// 검증 verify --> OK 2021_0903
////			System.out.println("나머지 : " + remainder);
////			System.out.println("몫 : " + calcValue);
////			System.out.println("-----------------");
//		}
//		
//		System.out.println("Sum of digits = " + String.format("%d", sum));
		
		/* (여기에 출력물 넣기)
		 * Enter an integer(0~9) : 123
		   Sum of digits = 6
		 */
		
//		// for문 사용버전
//		
//		Scanner scanner = new Scanner(System.in);
//		int inputValue = 0; // 사용자가 입력하는 숫자
//		int calcValue = 0; // 입력숫자 계산용 복사본, 계산시 몫으로 사용
//		int remainder = 0; // 계산시 나머지 값을 넣을 곳
//		int sum = 0; // 합계 구하는 변수
//		
//		String inputString = ""; // 사용자가 입력하는 숫자
//		int inputLength = 0 ; // 사용자의 입력 글자 길이
//		
//		System.out.print("Enter an integer(0~9) : ");
//		inputString = scanner.nextLine();
//		inputLength = inputString.length();
//		
//		calcValue = Integer.parseInt(inputString);
//		
//		for (int i = 1; i <= inputLength; i++) {
//			remainder = calcValue % 10;
//			sum += remainder;
//			calcValue /= 10; 
//		}
//		
//		
//		System.out.println("Sum of digits = " + String.format("%d", sum));
		
		// 입력한 한 자릿수 정수의 평균을 구하는 프로그램을 작성하라
		// Enter an integer(0~9) : 12345678
		// Average of digits = 36
		// 1. while ver.---------------------------------------------------
		
//		Scanner scanner = new Scanner(System.in);
//		int calcValue = 0; // 입력숫자 계산용 복사본, 계산시 몫으로 사용
//		double remainder = 0; // 계산시 나머지 값을 넣을 곳
//		double sum = 0; // 합계 구하는 변수
//		
//		System.out.print("Enter an integer(0~9) : ");
//		String inputString = ""; // 사용자가 입력하는 숫자
//		int inputLength = 0 ; // 사용자의 입력 글자 길이
//		
//		inputString = scanner.nextLine();
//		inputLength = inputString.length();
//		
//		calcValue = Integer.parseInt(inputString);
//		
//		while(calcValue != 0) {
//			remainder = calcValue % 10;
//			sum += remainder;
//			calcValue /= 10.0;
//			
//			// 검증 verify --> OK 2021_0903
//			System.out.println("나머지 : " + remainder);
//			System.out.println("몫 : " + calcValue);
//			System.out.println("-----------------");
//		}
//		
//		System.out.println("inputLength = " + inputLength);
//		System.out.println("Average of digits = " + (sum/inputLength));
		
		// 2. for ver.------------------------------------------------------
		Scanner scanner = new Scanner(System.in);
		int calcValue = 0; // 입력숫자 계산용 복사본, 계산시 몫으로 사용
		double remainder = 0; // 계산시 나머지 값을 넣을 곳
		double sum = 0; // 합계 구하는 변수
		
		System.out.print("Enter an integer(0~9) : ");
		String inputString = ""; // 사용자가 입력하는 숫자
		int inputLength = 0 ; // 사용자의 입력 글자 길이
		
		inputString = scanner.nextLine();
		inputLength = inputString.length();
		
		calcValue = Integer.parseInt(inputString);
		
		for (int i = 0; i <= inputLength; i++) {
			remainder = calcValue % 10;
			calcValue = calcValue / 10;
			sum = sum + remainder ;
			
//			// 검증 --> OK
//			System.out.println("자리 : " + inputLength);
//			System.out.println("나머지 : " + remainder);
//			System.out.println("몫 : " + calcValue);
//			System.out.println("-----------------");
		}
		System.out.println("Sum of digits = " + sum);
		System.out.println("Average of digits = " + (sum/inputLength));
		
		
		
		
		
		

	} //

} //
