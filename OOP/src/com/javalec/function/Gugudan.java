package com.javalec.function;

public class Gugudan {
	// 컨트롤러 부분

	// Field or Property (전역변수 쓸 게 있을때 사용함)

	int inputNumber;
	// Constructor(생성자 꼭 만들어야됨 ************)
	
	public Gugudan() {
		
	}

	// Method 지역변수 안에서 정의함
	
	public Gugudan(int inputNumber) {
		super();
		this.inputNumber = inputNumber;
	}



	public void  guguCalc() {
		for (int i = 1; i <= 9; i++) {
			System.out.println(inputNumber + " X " + i + " = " 
		+ (inputNumber * i));	
		}
	
	}

} // end
