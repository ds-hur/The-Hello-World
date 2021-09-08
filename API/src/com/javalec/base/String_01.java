package com.javalec.base;

public class String_01 {

	public static void main(String[] args) {
		// 객체는 대문자로 쓴다.
//		String str1 = new String(); // 원래는 이렇게 써줘야 함
		String str0 = new String("abc");
		
		String str1 = "abcdefg" ;
		String str2 = "HIJKLMN" ;
		String str3 = "opqrstu" ;
		String str4 = " abc def g" ;
		String str5 ;
		
		// 메소드(func와 비슷)
		System.out.println(str1.concat(str2)); // 두 문자들을 합쳐준다
		System.out.println(str1.substring(3)); // 부분문자열, 012'3'부터 끝까지 프린트
		System.out.println(str1.substring(3, 5)); // '3'부터 5 전까지 3,4 프린트
		System.out.println(str1.length()); // 글자 길이, id입력 안하고 오케이 누를때 방지(0이 아니면 통과)
		
		System.out.println(str1.toUpperCase()); // 대문자로 바꿔주는 메소드 사용
		System.out.println(str2.toLowerCase());
		System.out.println(str1.indexOf('c')); //어디 있는지 확인할때 사용 ' ' 이거 지울때
		// *********************************************************************
		System.out.println(str4.trim()); //빈칸 없애주는것 *** 잊지말기 ***맨앞 맨뒤 빈칸만 없애준다
		System.out.println(str4.replace(" ", "")); //빈칸 모두 없애줄때 사용하는 것, 위에 명령어와 이 명령어를 써주면 됨
		
		
		str5 = str4.trim().replace(" ", "");
		System.out.println(str5);
		// *********************************************************************
		System.out.println(str1.equals(str5)); // 문자 비교할때는 == 아님!! **** 잊지말기 ****

	}

}
