package com.javalec.base;

public class StringBuilder_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder stringBuilder = new StringBuilder("abcdefg"); // 객체지향언어
		
		System.out.println(stringBuilder);
		stringBuilder.append("hijklm"); System.out.println(stringBuilder);
		stringBuilder.insert(3, "zzz"); System.out.println(stringBuilder); // 전화번호를 입력하세요에서 중간 - 입력하지 마세요 하는 이유, 이걸로 우리가 붙이면 됨
		stringBuilder.delete(3, 5); System.out.println(stringBuilder); // 3,4번째 글자 삭제

	}

}
