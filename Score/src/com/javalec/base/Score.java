package com.javalec.base;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 성적을 입력하세요
		// 귀하의 학점은 A학점 입니다.
		// 90A, 80B, 70C, 60D 50F
		
		Scanner scanner	 = new Scanner(System.in) ;
		Scanner scanner_1	 = new Scanner(System.in) ;
		int score = 0 ;
		String grade = "";
		String gg;
		
		System.out.print("성적을 입력하세요 \t: ");	
		score = scanner.nextInt(); // 정수를 받아오는 방법
		
		System.out.print("시험본 소감을 입력하세요 \t: ");	
		gg = scanner_1.nextLine(); // 문자를 받아오는 방법
		
		System.out.println(gg);
		
		if ((score > 100) || (score <0))	grade = "error";
		else if (score >= 90) 				grade = "A";
		else if (score >= 80) 				grade = "B";
		else if (score >= 70 ) 				grade = "C";
		else if (score >= 60) 				grade = "D";
		else if	(score >= 0)				grade = "F";
//		else 					grade = "error";
		
		if (grade == "error") System.out.println("점수가 잘못 입력되었습니다.");
		else 				  System.out.println("귀하의 학점은 " + grade + "학점 입니다.");
		

	} // Main

} // Score
