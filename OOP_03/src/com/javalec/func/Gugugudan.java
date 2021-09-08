package com.javalec.func;

public class Gugugudan {

	// Field
	

	// Constructor

	public Gugugudan() {
		
	}

	// Method

	public void guguCalc_old(int danNum) {
		for(int i = 1; i <= 9; i++) {
			System.out.println(danNum + " X " + i + " = " + (danNum * i));
		}
	}
	
	public String[] guguCalc(int danNum) {
		String[] guguDan = new String [9];
		for(int i = 1; i <= 9; i++) {
			guguDan[i-1] = (danNum + " X " + i + " = " + (danNum * i));
		}
		
		return guguDan;
	}
	
	
}
