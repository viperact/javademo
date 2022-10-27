package ncs.test3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

/*
 * 현재 년도 : 1987
 * 현재 월 : 5
 * 오늘 날짜 : 27
 * 
 * 실행결과
 * 생일 : 1987년 5월 27일 수요일
 * 현재 : 2016년 4월 18일
 * 나이 : 29세
 * 
 */
public class DateTest {

	public static void main(String[] args) {
		GregorianCalendar gc = new GregorianCalendar(1987, 4, 27);

		SimpleDateFormat sd = new SimpleDateFormat("yyyy년 M월 d일 E요일");
		System.out.println("생일 : " + sd.format(gc.getTime()));

		GregorianCalendar gg = new GregorianCalendar(2016, 3, 18);

		SimpleDateFormat sp = new SimpleDateFormat("yyyy년 M월 d일");
		System.out.println("현재 : " + sp.format(gg.getTime()));

		System.out.println("나이 : " + (gg.get(Calendar.YEAR) - gc.get(Calendar.YEAR)) + "세");

	}

}
