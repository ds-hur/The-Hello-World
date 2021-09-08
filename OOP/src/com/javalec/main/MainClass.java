package com.javalec.main;

import java.util.Scanner;

import com.javalec.function.SumEvenOdd;

public class MainClass {

	public static void main(String[] args) {
		// 객체지향 프로그래밍
		// 뷰 부분 / M은 데이터베이스 배워야함

		Scanner scanner = new Scanner(System.in);
		int fromNum = 0 ; // 범위 출발 숫자
		int toNum = 0 ; // 끝 숫자
		
		System.out.println("범위의 출발 숫자를 입력하세요 : ");
		fromNum = scanner.nextInt();
		
		System.out.println("범위의 끝 숫자를 입력하세요 : ");
		toNum = scanner.nextInt();

//		int startNum = 100, endNum = 200;

//		SumEvenOdd sumEvenOdd = new SumEvenOdd(); // V1.0
//		int sum = sumEvenOdd.sumCalc(startNum, endNum); // V1.0
//		String result = sumEvenOdd.evenOdd(sum); // V1.0
		
		SumEvenOdd sumEvenOdd = new SumEvenOdd(fromNum, toNum);
		// 클래스 인스턴스(또는 오브젝트) = new 컨스트럭터(생성자) 이름

		int sum = sumEvenOdd.sumCalc();

		String result = sumEvenOdd.evenOdd();

		System.out.println(sum);
		System.out.println(result);

	}

}
