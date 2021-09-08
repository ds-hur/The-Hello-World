package com.javalec.base;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		
		// 사용자로 부터 정수 입력 받아 처리하기
//		Scanner scanner = new Scanner(System.in) ;
//		
//		System.out.print("숫자 입력 : ");
//		int i = scanner.nextInt();
//		System.out.println("입력하신 숫자는 " + i + "입니다.");

		// 첫번째 숫자를 입력하세요 : 12
		// 두번째 숫자를 입력하세요 : 23
		// 덧셈, 뺄셈, 곱셈, 나눗셈, 나머지 계산하기
		
//		Scanner scanner = new Scanner(System.in) ;
//		
//		System.out.print("숫자 입력 : ");	
//		int i = scanner.nextInt();
//		
//		System.out.print("숫자 입력 : ");
//		int j = scanner.nextInt();
//
//		System.out.println("덧셈 \t: " + i + " + " + j + " = " + (i+j));
//		System.out.println("뺄셈 \t: " + i + " - " + j + " = " + (i-j));
//		System.out.println("곱셈 \t: " + i + " * " + j + " = " + (i*j));
//		System.out.println("나눗셈 \t: " + i + " / " + j + " = " + (i/j));
//		System.out.println("나머지 \t: " + i + " % " + j + " = " + (i%j));
		
		// 자동 증감 연산자
//		int i = 10 ;
//		int j = 2 ;
//		int k = 5 ;
////		i++ ; // i = i+1
//		i += 2 ;
//		System.out.println("증가" + i);
//		i-- ;
//		System.out.println("감소" + i);
//		
//		// 동등 비교 관계 연산자
//		System.out.println("i == j : " + (i==j));
//		System.out.println("i != j : " + (i!=j));
//		System.out.println("i > j : " + (i>j));
//		System.out.println("i < j : " + (i<j));
//		System.out.println("i <= j : " + (i<=j));
//		System.out.println("i >= j : " + (i>=j));
//		
//		// 논리연산자
//		System.out.println((i > j) && (j > k)); // and
//		System.out.println((i > j) || (j > k)); // or
//		
//		// 삼항연산자
//		System.out.println(k == 5 ? "Five" : "Other");
		
		// 줄여쓰는 연산자
		// i에 100 더하기
//		i = i +100 ;
//		i += 100 ;
//	
//		System.out.println(i);
		
		// 숫자를 입력하세요 : 6
		// 결과) 3의 배수
		// 숫자를 입력하세요 : 7
		// 결과) 3의 배수 아님
		
//		Scanner scanner = new Scanner(System.in) ;
//		
//		System.out.print("숫자 입력 \t: ");	
//		int a = scanner.nextInt();
//		System.out.print("결과 \t: ");
//		System.out.println((a % 3 == 0) ? "3의 배수" : "3의 배수 아님");
		
//		String result = "결과 \t: ";
//		System.out.println((a % 3 == 0) ? result + "3의 배수" : result + "3의 배수 아님");
		
		// 첫번째 숫자를 입력하세요 : 10
		// 두번째 숫자를 입력하세요 : 20
		// 계산값이 100을 초과하면 계산불가 표시
		
		// 덧셈 : 30
		// 뺄셈 : -10
		// 곱셈 : 계산불가
		// 나눗셈 : 0.5
		
//		Scanner scanner = new Scanner(System.in) ;
//		
//		System.out.print("첫번째 숫자를 입력하세요 \t: ");	
//		int i = scanner.nextInt();
//		
//		System.out.print("두번째 숫자를 입력하세요 \t: ");	
//		int j = scanner.nextInt();
//		double d = (i/(double)j); // 변화는 계산 전에 해준다.
//		String result_a = ("덧셈 \t: " + (i+j));
//		String result_b = ("뺄셈 \t: " + (i-j));
//		String result_c = ("곱셈 \t: " + (i*j));
////		String result_d = ("나눗셈 \t: " + d);
//		String result_e = ("몫 \t: " + (i/j));
//		String result_f = ("나머지 \t: " + (i%j));
//		
//		System.out.println(((i+j) > 100) ? "계산불가" : result_a);
//		System.out.println(((i-j) > 100) ? "계산불가" : result_b);
//		System.out.println(((i*j) > 100) ? "계산불가" : result_c);
////		System.out.println(((i/j) > 100) ? "계산불가" : result_d);
//		System.out.println(((i/j) > 100) ? "계산불가" : result_e);
//		System.out.println(((i%j) > 100) ? "계산불가" : result_f);
		
		// 가로를 입력하세요 : 5
		// 세로를 입력하세요 : 4
		// ->
		// 직사각형의 넓이는 20이고, 둘레는 18입니다.
		
//		Scanner scanner = new Scanner(System.in) ;
//		
//		System.out.print("가로를 입력하세요 \t: ");	
//		int i = scanner.nextInt();
//		
//		System.out.print("세로를 입력하세요 \t: ");	
//		int j = scanner.nextInt();
//		
//		System.out.println("->\n직사각형의 넓이는 " + (i*j) + "이고, \n직사각형의 둘레는 " + (2*(i+j))+ "입니다.");
		
//		System.out.println(Math.pow(2,4));
		// BMI : 몸무게 / (신장+신장)
		// 저체중 : 18.5 미만 / 정상 : 18.5 이상 22.9 이하
		// 과체중 : 23 이상 24.9 이하 /
		// 비만 1단계 : 25 이상 29.9 이하
		// 비만 2단계 : 30 이상 39.9 이하
		// 심각한 비만 상태 : 40이상
		
		Scanner scanner = new Scanner(System.in) ;
		
		System.out.print("몸무게를 입력하세요 \t: ");	
		int w = scanner.nextInt();
		
		System.out.print("신장을 입력하세요 \t: ");	
		int h = scanner.nextInt();
		
		double height = Math.pow(((double)h * 0.01), 2) ;
//		System.out.println(height);
		double bmi = (Math.round((w / (height))*100)/100.0) ;
//		System.out.println(bmi);
		
		String status = (bmi >= 40 ? "심각한 비만 상태"
						: (bmi >= 30 && bmi < 39.9) ? "비만 2단계"
						: (bmi >= 25 && bmi <= 29.9) ? "비만 1단계"
						: (bmi >= 23 && bmi <= 24.9) ? "과체중"
						: (bmi >= 18.5 && bmi <= 22.9) ? "정상"
						: (bmi < 18.5) ? "저체중"
						: "") ; // 끝낼때 반드시 사용해야함
		System.out.println("->\n당신의 BMI는 " + bmi + "이고, " + status + "입니다.");
		
		System.out.println(String.format("%.2f", bmi));

	
		
		
		
		
		
		
		
		
		
	}

}
