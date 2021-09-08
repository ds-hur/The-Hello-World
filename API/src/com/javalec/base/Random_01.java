package com.javalec.base;

import java.util.Random;

public class Random_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		for (int j = 1; j<=6; j++) {
			
			int i = random.nextInt(46); // 11 전까지의 난수
			System.out.println(i);
		}

	}

}
