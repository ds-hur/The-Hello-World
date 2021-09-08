package com.javalec.function;

public class SumEvenOdd {
	// 컨트롤러 부분
	
	// Field or Property (전역변수 쓸 게 있을때 사용함)
	private int num1 = 0;
	private int num2 = 0;
	private int sumNum = 0;
	
	// Constructor(생성자 꼭 만들어야됨 ************)
	
	public SumEvenOdd() {
		// 구조화된 프로그래밍
	}
	
	// 마우스 오른쪽 - 소스 - G C u F 누르기
	public SumEvenOdd(int num1, int num2) {
		super();
		this.num1 = num1; // 전역변수로 데이터를 넘겨주는 역할
		this.num2 = num2;
	}


	// Method 지역변수 안에서 정의함
	
//	public int sumCalc(int i, int j) {
//		int sum = 0;
//		for(int x = i; x <= j; x++) {
//			sum += x;
//		}
//		return sum;
//	}
	public int sumCalc() {
		for(int x = num1; x <= num2; x++) {
			sumNum += x;
		}
		return sumNum;
	}
	
	public String evenOdd() {
		String result;
		int j = sumNum % 2 ;
		if (j==0) {
			result = "짝수";
		}else {
			result = "홀수";
		}
		return result;
		
		
		
		
		
	}

} //
