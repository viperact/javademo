package java014_api;

// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/text/SimpleDateFormat.html

import java.text.SimpleDateFormat;

public class Java148_System {

	public static void main(String[] args) {
		// currentTimeMillis() : 1970. 1. 1 부터 초단위로
		// 누적한 값을 밀리세컨드로 리턴한다.
		// 하루는 86,400초이다. 1초는 1,000밀리 세컨드이다.
		long curr = System.currentTimeMillis();
		System.out.println(curr);

		// HH(대문자) : 24시간, hh(소문자):12시간
		String pattern = "yyyy-MM-dd  HH:mm:ss a EEEE";
		// a : 오전, 오후 / EEEE : 요일 , (EEE : 요일이빠짐)
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);

		// long -> Long(auto boxing) -> Object(up-casting)
		String date = sdf.format(curr);
		// long 타입이 Object로 바뀌면서 auto boxing과 up-casting이 발생
		System.out.println(date);

	}// end main()

}// end class
