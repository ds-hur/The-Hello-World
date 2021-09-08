package com.javalec.base;

import java.util.Scanner;

import com.javalec.func.Gugudan; // 여기있음

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int dan = 0;
		
		System.out.println("구구단을 출력할 숫자를 입력하세요 : ");
		dan = scanner.nextInt();
		
		Gugudan gugudan = new Gugudan(dan);
		gugudan.calc(); // 점 밑에는 메소드 calc
	}

}
