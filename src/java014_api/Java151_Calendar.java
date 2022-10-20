package java014_api;

import java.util.Calendar;

/*
 * 수능일 : 2022-11-17
 * 오늘 : 2022-10-20
 * 남은일 : 15
 */
public class Java151_Calendar {

	public static void main(String[] args) {
		Calendar examDay = Calendar.getInstance();
		int examDay_year = 2022;
		int examDay_month = 11;
		int examDay_date = 17;

		// 수능일
		examDay.set(examDay_year, examDay_month - 1, examDay_date);
		System.out.println(examDay.toString());

		// 오늘
		Calendar toDay = Calendar.getInstance();
		System.out.println(toDay);

		long eventDay = examDay.getTimeInMillis();
		long nowDay = toDay.getTimeInMillis();
		System.out.println("eventDay:" + eventDay);
		System.out.println("nowDay:" + nowDay);

		// 86400000 -> 하루를 ms로 계산한 값
		// 하루의 초 계산 = 60(1분의 초)*60(1시간의 분)*24(하루 시간), *1000(m/s)을 해주면 하루의 m/s 계산
		System.out.println(60 * 60 * 24 * 1000);
		long endDay = (eventDay - nowDay) / (60 * 60 * 24 * 1000);
		// 남은일수의 ms값 / 하루의 ms값 = 일 수
		System.out.println("남은 일:" + endDay);

	}// end main

}// end class
