package com.javalec.base;

import java.util.Scanner;

public class Gugu_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 입력 받은 숫자로 구구단을 출력하는 프로그램을 클래스로 분리해서 객체지향 형식으로 지정.
		// 클래스 구성시에 몇단을 출력할 것인지 정할것.
		
		Scanner scanner = new Scanner(System.in);
		
		int inputNumber = 0;
		
		System.out.println("구구단을 출력할 숫자를 입력하세요 : ");
		inputNumber = scanner.nextInt();
		
		for (int i = 1; i <= 9; i++) {
			System.out.println(inputNumber + " X " + i + " = " + (inputNumber * i));
		}
		


	}

}
