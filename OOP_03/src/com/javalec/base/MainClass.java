package com.javalec.base;

import java.util.Arrays;
import java.util.Scanner;

import com.javalec.func.Gugugudan;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int danNum = 0;
		
		System.out.println("구구단을 출력할 숫자를 입력하세요 : ");
		danNum = scanner.nextInt();
		
		Gugugudan gugugudan = new Gugugudan();
//		gugugudan.guguCalc(danNum);
		String str[] = gugugudan.guguCalc(danNum);
		
		System.out.println(Arrays.toString(str));

	}

}
