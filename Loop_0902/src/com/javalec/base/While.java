package com.javalec.base;

import java.util.Scanner;

//import jdk.internal.misc.FileSystemOption;

public class While {

	public static void main(String[] args) {
		
		// 1. 1부터 100까지의 합을 구하기 --------------------------------------------

//		int i = 1, tot = 0 ;
//		while(i <= 100) {
//			tot += i ;
//			i++;
//		}
//		while(true) {
//			tot+=i;
//			i++;
//			if (i > 100) {
//				break;
//			}
//		}
//		System.out.println(tot);
		
		// 2. 이중 for 문을 이용해 아래의 모양 만들기 -----------------------------------
		//	*
		//	**
		//	***
		//	****
		//	*****
		//	****
		//	***
		//	**
		//	*

//		Scanner scanner = new Scanner(System.in);
//		int inputNumber = 0; // 사용자 입력
//		
//		System.out.println("Input your decimal no. : ");
//		inputNumber = scanner.nextInt() ;
//
//		for(int i = 1; i <= inputNumber; i++) {				
//			for(int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();			
//		}
//		
//		for(int i = 1; i <= inputNumber; i++) {							
//			for(int k = inputNumber ; k > i; k--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

		// 3. 이중 for 문을 이용해 아래의 모양 만들기 -----------------------------------
		//	1	
		//	2	3	
		//	3	4	5	
		//	4	5	6	7	
		//	5	6	7	8	9	
		//	6	7	8	9	10	11
		
		
//		Scanner scanner = new Scanner(System.in);
//		int inputNumber = 0; // 사용자 입력
//		int temp = 1;
//		int tot = 1;
//
//		System.out.println("몇 단계의 피라미드로 구성할까 : ");
//		inputNumber = scanner.nextInt();
//
//		for (int i = 0; i <= inputNumber; i++) {
//			for (int j = 0; j <= i; j++) {
//				temp = i + j ;
//				tot = temp + 1;
//				System.out.print(tot + "\t");
//			}
//			tot = tot + 100;
//			System.out.println();
//		}

		// 4. 이중 for 문을 이용해 홀수만 * 모양으로 만들기 ------------------------------
		//  *
		//	2  *
		//	4  *  6
		//	*  8  * 10
		//	* 12  * 14  *
		
//		Scanner scanner = new Scanner(System.in);
//		int inputNumber = 0; // 사용자 입력
//		int t = 0;
//		
//		System.out.println("몇 단계의 피라미드로 구성할까 : ");
//		inputNumber = scanner.nextInt();
//
//		for (int i = 1; i <= inputNumber; i++) {
//			for (int j = 1; j <= i; j++) {
//				
//				t = t + 1;
//				if (t%2 != 0) {
//					System.out.printf("%3s", "*");
//				}else {
//					System.out.printf("%3d",t);
//				}
//			}
//			System.out.println();
//		}

		// 5. 이중 for 문을 이용해 아래의 모양으로 만들기 ------------------------------
		//	10^  0 =              1
		//	10^  1 =             10
		//	10^  2 =            100
		//	10^  3 =           1000
		//	10^  4 =          10000
		//	10^  5 =         100000
		//	10^  6 =        1000000
		//	10^  7 =       10000000
		//	10^  8 =      100000000
		//	10^  9 =     1000000000
		//	10^ 10 =    10000000000
		
		// 10의 10의 0 제곱 ~ 10의 10제곱까지의 제곱승을 구하여라
		// String.format("%14.0f",q)은 14자리수 맞추어 정렬, 소수점 다 버리기, d는 10진수,f는 플로트
		// int 대신 long을 사용해도 됨

//		double q = 1;
//		for (int i = 0; i <= 10; i++) {
//			System.out.println("10^ " + String.format("%2d", i) + " = " + String.format("%14.0f",q));
//			q = Math.pow(10, i+1);
//		}

		// 6. 팩토리얼 만들기 (예 : 4입력 -> 4*3*2*1 =24출력)--------------------------
//		Scanner scanner = new Scanner(System.in);
//		int inputNumber = 0; // 사용자 입력
//		int tot = 1;
//
//		System.out.print("Input your decimal no. : ");
//		inputNumber = scanner.nextInt();
//		
//		for (int i = 1; i <= inputNumber; i++) {
//			tot = tot * i ;
//		}
//		System.out.println(inputNumber + "'s factorial number : " + tot);


		// 7. 입력한 한 자릿수 정수의 합을 구하는 프로그램을 작성하라.(12345678) -> 36 출력---

//		Scanner scanner = new Scanner(System.in);
//		int inputNumber = 0; // 사용자 입력
//		int temp = 0; // 10으로 나눈 나머지 값 저장
//		int result = 0; // 나머지들의 합계 저장
//
//		System.out.print("Enter an integer(0 ~ 9) : ");
//		inputNumber = scanner.nextInt();
//		
//
//		// inputNumber가 0이 아니면 계속 돌아가는 while문으로 계산
//		while (inputNumber != 0) {
//			temp = inputNumber % 10;
//			inputNumber = inputNumber / 10;
//			result = result + temp;
//		}
//		System.out.println("Sum of digits = " + result);

		// <7번 문제의 또다른 방법> 변수 두가지만 사용하여 코드 줄이기 -----------------------
		
//		Scanner scanner = new Scanner(System.in);
//		int inputNumber = 0; // 사용자 입력
//		int result = 0; // 나머지들의 합계 저장
//
//		System.out.print("Enter an integer(0 ~ 9) : ");
//		inputNumber = scanner.nextInt();
//		
//		while (inputNumber != 0) {
//			result = result + (inputNumber % 10) ;
//			inputNumber = inputNumber / 10 ; 
//		}
//		System.out.println("Sum of digits = " + result);
		
		// <7번 코드 응용>---------------------------------------------------------
		// 8. 입력한 한 자릿수 정수의 홀수, 짝수의 수를 구하는 프로그램을 작성하라.-------------
		// 입력 : 12345678 -> 출력 : 사용자 입력 숫자 중 짝수는 4개, 홀수는 4개입니다.
		
//		Scanner scanner = new Scanner(System.in);
//		int inputNumber = 0; // 사용자 입력
//		int temp = 0; // 임시저장소
//		int even_result = 0; // 짝수 저장
//		int odd_result = 0; // 홀수 저장
//
//		System.out.print("Enter an integer(0 ~ 9) : ");
//		inputNumber = scanner.nextInt();
//		
//		while (inputNumber != 0) {
//			
//			temp = (inputNumber % 10) ;
//			if (temp % 2 == 0) {
//				even_result = even_result + 1;
//			}else {
//				odd_result = odd_result + 1;
//			}
//			
//			inputNumber = inputNumber / 10 ; 
//		}
//		System.out.println("사용자 입력 숫자 중 짝수는 " + even_result + "개, 홀수는 " + odd_result + "개입니다.");
		
	
		
		
		
		
		
		
	}//

}//
