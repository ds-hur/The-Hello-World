package com.javalec.base;

import java.util.Calendar;

public class Calender_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar calendar = Calendar.getInstance(); // ** new 안적음 주의 **
		
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH) + 1; //0월이 1월이라 9월 만드려고 1더해줌
		int minute = calendar.get(Calendar.MINUTE);
		int hour = calendar.get(Calendar.HOUR);
		int second = calendar.get(Calendar.SECOND);
		
		int day = calendar.get(Calendar.DATE);
		int m_day = calendar.get(Calendar.MONDAY);
		int tu_day = calendar.get(Calendar.TUESDAY);
		int w_day = calendar.get(Calendar.WEDNESDAY);
		int th_day = calendar.get(Calendar.THURSDAY);
		int f_day = calendar.get(Calendar.FRIDAY);
		int sa_day = calendar.get(Calendar.SATURDAY);
		int su_day = calendar.get(Calendar.SUNDAY);
		
		int week_day = calendar.get(Calendar.DAY_OF_WEEK);
		int week_month_day = calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH);
		
//		System.out.println(year + "-" + month);
//		System.out.println("day : " + day);
//		System.out.println("hour : " + hour);
//		System.out.println("minute : " + minute);
//		System.out.println("second " + second);
//		System.out.println(hour + " : " + minute + " : " + second);
//		System.out.println("------------------------------------");
//		
//		System.out.println("m_day " + m_day);
//		System.out.println("tu_day " + tu_day);
//		System.out.println("w_day " + w_day);
//		System.out.println("th_day " + th_day);
//		System.out.println("f_day " + f_day);
//		System.out.println("sa_day " + sa_day);
//		System.out.println("su_day " + su_day);
		
		System.out.println("week_day " + week_day);

	}

}
