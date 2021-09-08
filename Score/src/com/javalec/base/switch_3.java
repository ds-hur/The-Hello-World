package com.javalec.base;

import java.util.Scanner;

public class switch_3 {

	public static void main(String[] args) {
		// 1부터 10까지의 수 중 짝수의 합과 홀수 합을 구하기 (if문 사용하기)
		
//		int tot_even = 0;
//		int tot_odd = 0;
		
//		for(int i = 1; i <= 10; i++) {
//			if (i%2 == 0) {
//				System.out.println(" 짝수 : " + tot_even);
//				tot_even = tot_even + i ;
//			}else {
//				System.out.println(" 홀수 : " + tot_odd);
//				tot_odd = tot_odd + i ;		
//			}
//			
//		}
//		System.out.println("홀수의 합은 : " + tot_odd + " 이고, 짝수의 합은 : " + tot_even + " 입니다.");
		
//		for(int i = 1; i <= 10; i = i+2) {
//			tot_odd = tot_odd + i ;
//		}
//		System.out.println("홀수의 합은 : " + tot_odd + " 입니다.");
//		
//		for(int i = 0; i <= 10; i = i+2) {
//			tot_even = tot_even + i ;
//		}
//		System.out.println("짝수의 합은 : " + tot_even + " 입니다.");
		
		// 시작 숫자를 입력하세요 : 1
		// 끝 숫자를 입력하세요 : 10
		// 1 부터 10 까지의 합계는 55 입니다.
		
//		Scanner scanner	 = new Scanner(System.in) ;
		
//		int start = 0 ;
//		int end = 0 ;
//		int result = 0 ;
		
//		System.out.print("시작 숫자를 입력하세요 \t: ");	
//		start = scanner.nextInt(); // 정수를 받아오는 방법
//		
//		System.out.print("끝 숫자를 입력하세요 \t: ");	
//		end = scanner.nextInt(); // 정수를 받아오는 방법
//		
//		for(int i = start; i <= end; i++) {
//			result = result + i ;
//		}
//		System.out.println(start + " 부터 " + end + " 까지의 합계는 " +result+ " 입니다.");
		
		// 시작 10, 끝 1 바꿔서 계산하기
		
//		int start = 0 ;
//		int end = 0 ;
//		int temp = 0;
//		int result = 0 ;
//		
//		System.out.print("시작 숫자를 입력하세요 \t: ");	
//		start = scanner.nextInt(); // 정수를 받아오는 방법
//		
//		System.out.print("끝 숫자를 입력하세요 \t: ");	
//		end = scanner.nextInt(); // 정수를 받아오는 방법
//		
//		if (start > end) {
//			temp = start;
//			start = end;
//			end = temp;
//			
//		}
//		for(int i = start; i <= end; i++) {
//		result = result + i ;
//		}
//		System.out.println(start + " 부터 " + end + " 까지의 합계는 " +result+ " 입니다.");
		
		// 구구단으로 사용할 숫자를 입력하세요!
		
//		int userNumber = 0;
//		int result = 0;
//		
//		System.out.print("구구단으로 사용할 숫자를 입력하세요! \t: ");	
//		userNumber = scanner.nextInt(); // 정수를 받아오는 방법
//		
//		for (int i = 1; i <= 9; i++) {
//			result = userNumber * i ;
//			System.out.println(userNumber + " * " + i + " = " + result);
//		}
		
		 // 입력한 숫자부터 4개를 증가하여 화면 가로로 구구단을 표시하기
//		String.format("%2d",result_1)
		Scanner scanner	 = new Scanner(System.in) ;
		
		int userNumber = 0;
		int result = 0;
		int result_2 = 0;
		int result_3 = 0;
		int result_4 = 0;
		
		System.out.print("구구단으로 사용할 숫자를 입력하세요! \t: ");	
		userNumber = scanner.nextInt(); // 정수를 받아오는 방법
		
//		for (int i = 1; i <= 9; i++) {
//			result = userNumber * i ;
//			result_2 = (userNumber + 1) * i ;
//			result_3 = (userNumber + 2) * i ;
//			result_4 = (userNumber + 3) * i ;
//			String X = (userNumber + " * " + i + " = " + String.format("%2d",result) + "\t" +
//								(userNumber+1) + " * " + i + " = " + String.format("%2d",result_2) + "\t" +
//								(userNumber+2) + " * " + i + " = " + String.format("%2d",result_3) + "\t" +
//								(userNumber+3) + " * " + i + " = " + String.format("%2d",result_4));
//			System.out.println(X);
//		}
		String X2 = "";
		String X = "";
		for (int j = 0; j <= 3; j++) {
			for (int i = 1; i <=9; i++) {
				result = (userNumber+j) * i ;
				X = ((userNumber+j) + " * " + i + " = " + String.format("%2d",result) + "\t");
				System.out.print(X);
			}
		}
		

		
		
		
		
		
		
		
		
		
		
		

	}

}
