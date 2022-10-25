package ncs.test3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

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

		Calendar cal = new GregorianCalendar(1987, 4, 27, 0, 0, 0);
		System.out.println(cal);

		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int date = cal.get(Calendar.DATE);
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);

		String bd = "";
		switch (dayOfWeek) {
		case 1:
			bd = "일";
		case 2:
			bd = "월";
		case 3:
			bd = "화";
		case 4:
			bd = "수";
		case 5:
			bd = "목";
		case 6:
			bd = "금";
		case 7:
			bd = "토";
			
		}
		System.out.printf("생일 :%d년 %d월 %d일 %s요일 ", year, month, date, bd);
	}

}
