package com.javalec.base;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Scanner scanner = new Scanner(System.in);
//		int inputNumber = 0; // 사용자 입력
//		String result = ""; // 처리결과 저장소
//		
//		System.out.println("숫자를 입력하세요 : ");
//		inputNumber = scanner.nextInt() ;
		
//		if(inputNumber % 2 == 0) {
//			result = "짝수" ;
//		}else {
//			result = "홀수";
//		}
		
//		switch(inputNumber % 2) {
//		case 0 :
//			result = "짝수" ;
//			break;
//		case 1 :
//			result = "홀수";
//			break;
//		case -1 :
//			result = "error";
//			break;
//		default :
//			result = "error";
//			break;
//		} // default 안써줘도 됨
//		
//		if (result == "error") {
//			System.out.println("숫자를 잘못입력하였습니다.");
//		}else {
//			System.out.println("입력하신 숫자 " + inputNumber + "은 " + result + "입니다.");
//		}
		
		// 성적을 입력하세요
		// 귀하의 학점은 A학점 입니다.
		// 90A, 80B, 70C, 60D 50F
		
		Scanner scanner	 = new Scanner(System.in) ;
		int score = 0 ;
		String result = "";
		
		System.out.print("성적을 입력하세요 \t: ");	
		score = scanner.nextInt(); // 정수를 받아오는 방법
		
		
		switch((score/10)) {
		case 10 :
			if (score > 100) {
				result = "error";
			}
			break;
		case 9 :
			result = "A" ;
			break;
		case 8 :
			result = "B";
			break;
		case 7 :
			result = "C";
			break;
		case 6 :
			result = "D";
			break;
		case 5 :
		case 4 :
		case 3 :
		case 2 :
		case 1 :
		case 0 :
			result = "F";
			break;
		default :
		result = "error";
		break;
			
		}
		
		System.out.println(result);
		
//		if ((score > 100) || (score < 0)) {
//			System.out.println("점수가 잘못 입력되었습니다.");
//		}else {
//			switch((score/10)) {
//			case 10 :
//			case 9 :
//				result = "A" ;
//				break;
//			case 8 :
//				result = "B";
//				break;
//			case 7 :
//				result = "C";
//				break;
//			case 6 :
//				result = "D";
//				break;
//			case 5 :
//			case 4 :
//			case 3 :
//			case 2 :
//			case 1 :
//			case 0 :
//				result = "F";
//				break;
//				
//			}
//			System.out.println("귀하의 학점은 " + result + "학점 입니다.");
//		}
		
		
		
	} //

} //
