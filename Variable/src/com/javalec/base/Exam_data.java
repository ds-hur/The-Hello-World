package com.javalec.base;

public class Exam_data {

	public static void main(String[] args) {
		// Data Type 변환
		
		// int -> double
		int i1 = 10 ;
		double d1 = i1 ; // 묵시적 변환
		System.out.println("d1 데이터는 " + d1 + "입니다.");
		
		// double -> int : (int)
		double d2 = 10.7 ; // 소수점 이하는 버림
		int i2 = (int) d2 ; // 명시적 변환
		System.out.println("i2 데이터는 " + i2 + "입니다.");
		
		// double -> String : Double.toString()
		double do1 = 3.14 ;
		String s=Double.toString(do1);
		System.out.println("s 데이터는 " + s + "입니다.");
		System.out.println(s.getClass().getName()); // String 으로 잘 바뀐건지 확인
		
		// String -> int : Integer.parseInt()
		String i3 = "123" ;
		int i4 = Integer.parseInt(i3) ;
		System.out.println("i4 데이터는 " + i4 + "입니다.");
		
		// String -> double : Double.parseDouble()
		String s1 = "123.789" ;
		double do2 = Double.parseDouble(s1);
		System.out.println("do2 데이터는 " + do2 + "입니다.");
		
		// int -> String : Integer.toString()
		String i5 = Integer.toString(i4) ;
		System.out.println("i5 데이터는 " + i5 + "입니다.");
		System.out.println(i5.getClass().getName()); // String 으로 잘 바뀐건지 확인

		// double -> int : (int)
		
		// to
		// int -> String : Integer.toString()
		// double -> String : Double.toString()
		
		// parse
		// String -> int : Integer.parseInt()
		// String -> double : Double.parseDouble()
		
		
	}

}
