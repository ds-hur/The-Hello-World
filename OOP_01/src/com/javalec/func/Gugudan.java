package com.javalec.func;

public class Gugudan {

	
	// Field
	int dan = 0;
	// Constructor
	
	public Gugudan() {
		// TODO Auto-generated constructor stub
	}
	

	public Gugudan(int dan) {
		super();
		this.dan = dan;
	}


	// Method
	
	public void calcold(int dan) {
		for(int i = 1; i <= 9; i++) {
			System.out.println(dan + " X " + i + " = " + (dan*i));
		}
	}
	
	public void calc() {
		for(int i = 1; i <= 9; i++) {
			System.out.println(dan + " X " + i + " = " + (dan*i));
		}
	}
	
//	public String[] calcNew() {
//		
//	}
//	retrun
	
	
	
} //
