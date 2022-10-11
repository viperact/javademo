package java005_method;

public class java054_method {
	public static void main(String[] args) {
		int year = 2013;
		boolean result = isLeapYear(year); // isLeapYear변수의 리턴타입이 boolean이기 때문

		if (result) {
			System.out.printf("%d년도는 윤년입니다.\n", year);
		} else {
			System.out.printf("%d년도는 평년입니다.\n", year);
		}

	}// end main()

	public static boolean isLeapYear(int year) {
		// 어떤 년도가 윤년이면 true, 평년이면 false를 리턴하는 프로그램 구현

//		boolean chk; //논리값을 지정할 변수 지정
		
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
//			chk = true;
			return true; //변수값을 지정하지 않았을떄의 실행문
		} else {
//			chk = false;
			return false; //변수값을 지정하지 않았을떄의 실행문 (리턴값은 하나만써야해서 밖의 리턴도 쓸 수 없음)
		}
//		return chk;

	}// end isLeapYear

}// end class
