package com.javalec.base;

import java.util.Scanner;

public class if_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 성적을 입력하세요
		// 귀하의 학점은 A학점 입니다.
		// 90A, 80B, 70C, 60D 50F
		
		Scanner scanner = new Scanner(System.in) ;
		
		System.out.print("성적을 입력하세요 \t: ");	
		int score = scanner.nextInt();
		
		String grade = (score > 100 ? "점수를 잘못입력했습니다."
				: (score >= 90) ? "귀하의 학점은 A 입니다."
				: (score >= 80) ? "귀하의 학점은 B 입니다."
				: (score >= 70) ? "귀하의 학점은 C 입니다."
				: (score >= 60) ? "귀하의 학점은 D 입니다."
				: "귀하의 학점은 F 입니다.") ;
		
		System.out.println(grade);

	}

}
