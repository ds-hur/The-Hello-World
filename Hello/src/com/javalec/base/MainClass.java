package com.javalec.base;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		다음의 문장은 문자열을 출력하는 기능입니다.
		
		/*
		 * 설명을 길게 달 수도 있음
		 * 
		 * 
		 * 
		 * 
		 */
		
//		System.out.println("aaa");
//		System.out.println("bbb");
//		
//		// ln 지워주면 줄 띄어쓰기 안해줌
//		System.out.print("111");
//		System.out.print("222");
//		System.out.print("333");
//		
//		// 그냥 빈줄로 나옴
//		System.out.println();
//		
//		// 숫자
//		System.out.println(12+12);
//		
//		// 문자
//		System.out.println("12+12");
//		
		System.out.println("-----------------------------");
		
		// 변수
		int i = 10 ; // heap memory : i, data memory : 10, 데이터 메모리는 계속 지워짐
		int j = 20 ;
		int k = i + j ;
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		
		i = 40 ; // 있는 변수에 40을 넣겠다, *** 이렇게 써야 오류안생김 ***
		System.out.println(i+j);
		
		i = 123 ;
		
		char a = 'a' ; // *** 홑따옴표만 사용가능 ***
		char b = 'b' ; // *** 홑따옴표만 사용가능 ***
		System.out.println(a);
		System.out.println(a+b); // 프린트하면 16진수값 합친 숫자가 나옴
		
		String aa = "aa" ; // *** 쌍따옴표만 사용가능 ***
		String bb = "bb" ;
		System.out.println(aa);
		System.out.println(aa+bb); // 문자끼리 합쳐짐
	
		
		
		
		
		
		
		
		
		

	} // Scope(범위)

} //---End
