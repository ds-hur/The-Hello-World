package com.javalec.function;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int fromNum = 1 ; // 범위 출발 숫자
		int toNum = 10 ; // 끝 숫자
		
		SumEvenOdd sumEvenOdd = new SumEvenOdd(fromNum, toNum);
		// 클래스 인스턴스(또는 오브젝트) = new 컨스트럭터(생성자) 이름

		int sum = sumEvenOdd.sumCalc();

		String result = sumEvenOdd.evenOdd();

	}

}
