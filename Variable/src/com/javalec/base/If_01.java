package com.javalec.base;

import java.util.Scanner;

public class If_01 {

	public static void main(String[] args) {
		// 비교문, 조건문, Conditional Statement
//		int i = 10, j = 20, k = 10 ;
//		
//		if(i > j) {
//			System.out.println("i가 j보다 " + (i-j) + " 만큼 큽니다.");
//		}else {
//			System.out.println("j가 i보다 " + (j-i) + " 만큼 큽니다.");
//		}
//		if(i == k) {
//			System.out.println("i와 k가 같습니다.");
//		}
		
//		int price = 5000;
//		if(price > 8000) {
//			System.out.println("너무 비쌉니다.");
//		}else if(price > 5000) {
//			System.out.println("조금 비쌉니다.");			
//		}else if(price > 3000) {
//			System.out.println("적당한 가격입니다.");			
//		}else {
//			System.out.println("구매하실래요?");
//		}
		
		// 국어 점수를 입력하세요!
		// 90
		// 영어 점수를 입력하세요!
		// 80
		// 수학 점수를 입력하세요!
		// 70
		
		// 평균점수 : 80.0 (더블)
		// 국어 점수는 평균 보다 높습니다.
		// 영어 점수는 평균 점수 입니다.
		// 수학 점수는 평균 보다 낮습니다.
		
		Scanner scanner = new Scanner(System.in) ;
		
		System.out.println("국어 점수를 입력하세요 \t: ");	
		int korea = scanner.nextInt();		
		System.out.println("영어 점수를 입력하세요 \t: ");	
		int eglish = scanner.nextInt();
		System.out.println("수학 점수를 입력하세요 \t: ");	
		int math = scanner.nextInt();
		
		double mean_score = (korea + eglish + math) / 3.0 ;
		System.out.println("평균점수 : " + mean_score);
		
		String result_k = "";
		String result_e = "";
		String result_m = "";
		
		if(korea > mean_score) {
			result_k = "보다 높습니다.";
		}else if(korea == mean_score) {
			result_k = "점수 입니다.";			
		}else {
			result_k = "보다 낮습니다.";
		}
		
		if(eglish > mean_score) {
			result_e = "보다 높습니다.";
		}else if(eglish == mean_score) {
			result_e = "점수 입니다.";			
		}else {
			result_e = "보다 낮습니다.";
		}
		
		if(math > mean_score) {
			result_m = "보다 높습니다.";
		}else if(math == mean_score) {
			result_m = "점수 입니다.";			
		}else {
			result_m = "보다 낮습니다.";
		}
		
		System.out.println("국어 점수는 평균 " + result_k);
		System.out.println("영어 점수는 평균 " + result_e);
		System.out.println("수학 점수는 평균 " + result_m);
		

	} //

} // main
