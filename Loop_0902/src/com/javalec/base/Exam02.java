package com.javalec.base;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 입력한 한 자릿수 정수의 분산을 구하는 프로그램을 작성하라
		// Enter an integer(0~9) : 12345678
		// Average of digits = 36

		// 2. for ver.------------------------------------------------------
//		Scanner scanner = new Scanner(System.in);
//		int calcValue = 0; // 입력숫자 계산용 복사본, 계산시 몫으로 사용
//		double remainder = 0; // 계산시 나머지 값을 넣을 곳
//		double sum = 0; // 합계 구하는 변수
//		double ave = 0; // 평균
//		double v_sum = 0; // 변수 제곱의 합
//		double v = 0; // 분산
//		double sd = 0; // 표준편차
//
//		System.out.print("Enter an integer(0~9) : ");
//		String inputString = ""; // 사용자가 입력하는 숫자
//		int inputLength = 0; // 사용자의 입력 글자 길이

//		inputString = scanner.nextLine();
//		inputLength = inputString.length();
//
//		calcValue = Integer.parseInt(inputString);
//
//		for (int i = 0; i < inputLength; i++) {
//			remainder = calcValue % 10;
//			calcValue = calcValue / 10;
//			sum = sum + remainder;
//			v_sum = v_sum + (remainder * remainder);
//
//			// 검증 --> OK
////			System.out.println("자리 : " + inputLength);
////			System.out.println("나머지 : " + remainder);
////			System.out.println("몫 : " + calcValue);
////			System.out.println("sum : " + sum);
////			System.out.println("v_sum : " + v_sum);
////			System.out.println("-----------------");
//		}
//		
////		while (calcValue != 0) {
////			remainder = calcValue % 10;
////			calcValue = calcValue / 10;
////			sum = sum + remainder;
////			v_sum =  v_sum + (remainder * remainder) ;
////		}
//		
//		ave = (sum / inputLength);
//		v = (v_sum / inputLength) - (ave * ave);
//		sd = Math.sqrt(v);
//		
//		System.out.println("Sum of digits = " + sum);
//		System.out.println("Average of digits = " + ave);
//		System.out.println("variance of digits = " + v);
//		System.out.println("standard deviation = " + sd);
		
		/*
		 	몇개의 숫자를 더할까요? : 5
		 	5의 숫자를 입력하세요
		 	1
		 	1
		 	1
		 	2
		 	3
			입력한 숫자의 합은 8입니다.
		 */
		
		// 더하기 할 숫자들의 개수를 정한 수 숫자를 입력받아서 입력한 숫자의 합을 구하는 프로그램 작성.
		// 몇개의 숫자를 더할까요? : 4
		// 4 의 숫자를 입력하세요
		// 1
		// 2
		// 3
		// 4
		// 입력한 숫자의 합은 10입니다.
		
		Scanner scanner = new Scanner(System.in);
		int num = 0; // 자릿수 세부 입력 숫자
		int sum = 0; // 합계
		int tot = 0; // 숫자입력 횟수

		System.out.print("몇개의 숫자를 더할까요? : ");
		int inputNumber = 0; // 사용자가 입력하는 숫자
		
		inputNumber = scanner.nextInt();
		
		System.out.println(inputNumber + "의 숫자를 입력하세요");
				
//		while(tot < inputNumber) {
//			num = scanner.nextInt();
//			sum = sum + num;
//			tot = tot + 1;			
//		}
		
		for (int i = 1; i <= inputNumber; i++) {
			num = scanner.nextInt();
			sum = sum + num;
		}
		
		System.out.println("입력한 숫자의 합은 " + sum + "입니다.");
		System.out.println("-------------------------------");
		
		
		

	}

}
