package com.javalec.main;

import java.util.Scanner;

import com.javalec.function.Gugudan;
import com.javalec.function.SumEvenOdd;

public class MainClass_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		int inputNumber = 0;

		System.out.println("구구단을 출력할 숫자를 입력하세요 : ");
		inputNumber = scanner.nextInt();
		
		Gugudan gugudan = new Gugudan(inputNumber);
		// 클래스 인스턴스(또는 오브젝트) = new 컨스트럭터(생성자) 이름

		gugudan.guguCalc();
	}

}
