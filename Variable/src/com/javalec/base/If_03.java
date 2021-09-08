package com.javalec.base;

import java.util.Scanner;

public class If_03 {

	public static void main(String[] args) {
		// 성적을 입력하세요
		// 귀하의 학점은 A학점 입니다.
		// 90A, 80B, 70C, 60D 50F
		
		Scanner scanner = new Scanner(System.in) ;
		
		System.out.print("성적을 입력하세요 \t: ");	
		int score = scanner.nextInt();
		
		String grade = "" ;
		
		if (score < 0) {
			System.out.println("성적을 잘못입력하셨습니다.");
		}
		if (score <= 100) {
			if (score >= 90) {
				grade = "A" ;
			}else if (score >= 80) {
				grade = "B" ;
			}else if (score >= 70) {
				grade = "C" ;
			}else if (score >= 60) {
				grade = "D" ;
			}else {
				grade = "F" ;
			}
			System.out.println("귀하의 학점은 " + grade + "입니다.");
		}else {
			System.out.println("성적을 잘못입력하셨습니다.");
		}

	}

}
