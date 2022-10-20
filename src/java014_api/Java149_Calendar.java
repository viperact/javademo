package java014_api;

import java.util.Calendar;

/*
 * 추상클래스 , 새로 생성하지못함 
 */

public class Java149_Calendar {

	public static void main(String[] args) {
//		Test tt = new TestExam();
//		tt.prn();

//		Test ts = Test.getInstance();
//		ts.prn();

		Calendar cal = Calendar.getInstance();
		System.out.println(cal.toString());

		int year = cal.get(Calendar.YEAR);

		// MONTH는 1월 일때 0으로 리턴한다. (+1을 하는이유)
		int month = cal.get(Calendar.MONTH) + 1;

		int date = cal.get(Calendar.DATE);

		// int hour = cal.get(Calendar.HOUR); //12시간
		int hour = cal.get(Calendar.HOUR_OF_DAY); // 24시간

		int minute = cal.get(Calendar.MINUTE);

		int second = cal.get(Calendar.SECOND);

		System.out.printf("%d.%d.%d. %d:%d:%d\n", year, month, date, hour, minute, second);

		// 이번달의 마지막일 리턴
		System.out.println(cal.getActualMaximum(Calendar.DATE));

		// 오늘의 요일 리턴(일요일 -> 1 ... 토요일 -> 7)
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));

		// 오늘을 기준으로 5일전의 날짜로 설정
		cal.add(Calendar.DATE, -5);
		System.out.println(cal.toString());
		// DAY_OF_MONTH=15

		// set = 지정한 값으로 바로 계산
		cal.set(Calendar.YEAR, 2020);
		System.out.println(cal.toString());
		// YEAR=2020

		// MONTH를 출력할때는 +1, 출력값에서 가져올때는 -1
		cal.set(2017, 2, 1); // 2017 - 3 - 1
		System.out.println(cal.toString());
		
		//올해 시작일 부터 오늘까지의 총 일수
		System.out.println(cal.get(Calendar.DAY_OF_YEAR));
	}// end main()

}// end class

abstract class Test {
	private static TestExam te = new TestExam();

	abstract public void prn();

	public static Test getInstance() {
		return te;
	}
}

class TestExam extends Test {

	@Override
	public void prn() {
		System.out.println("prn");

	}
}