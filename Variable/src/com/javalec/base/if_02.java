package com.javalec.base;

import java.util.Scanner;

public class if_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in) ;
		
		System.out.println("국어 점수를 입력하세요 \t: ");	
		int korea = scanner.nextInt();		
		System.out.println("영어 점수를 입력하세요 \t: ");	
		int eglish = scanner.nextInt();
		System.out.println("수학 점수를 입력하세요 \t: ");	
		int math = scanner.nextInt();
		
		double mean_score = (korea + eglish + math) / 3.0 ;
		System.out.println("평균점수 : " + mean_score);
		
		String result_k = (korea > mean_score ? "국어 점수는 평균 보다 높습니다."
				: (korea == mean_score) ? "국어 점수는 평균 점수입니다."
				: "국어 점수는 평균 보다 낮습니다.") ; 
		
		String result_e = (eglish > mean_score ? "영어 점수는 평균 보다 높습니다."
				: (eglish == mean_score) ? "영어 점수는 평균 점수입니다."
						: "영어 점수는 평균 보다 낮습니다.") ; 
		
		String result_m = (math > mean_score ? "수학 점수는 평균 보다 높습니다."
				: (math == mean_score) ? "수학 점수는 평균 점수입니다."
						: "수학 점수는 평균 보다 낮습니다.") ; 
		
		System.out.println(result_k);
		System.out.println(result_e);
		System.out.println(result_m);

	}

}
