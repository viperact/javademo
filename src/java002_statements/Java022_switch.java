package java002_statements;

public class Java022_switch {
	static int num; // 멤버 변수 (class에서 선언된 변수) : 타입별로 기본값이 할당됨

	public static void main(String[] args) {
		// 30 : 4, 6, 9, 11
		// 31 : 1, 3, 5, 7, 8, 10, 12
		// 28 or 29 : 2

		// 로컬 변수 (지역 변수) - 기본값이 할당이 되지않음
		int year = 2012; // 년도
		int month = 2;
		int lastDay = -1; // 각 년도의 마지막 일

		if (!(month >= 1 && month <= 12)) {
			System.out.println("1월 ~ 12월만 가능합니다.");
			return; // main() 메소드를 강제적으로 빠져나올때
			// main 함수의 void는 리턴값이 없다는것을 뜻한다.
		}

		switch (month) {
		case 4:
		case 6:
		case 9:
		case 11:
			lastDay = 30;
			break;
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			lastDay = 31;
			break;
		default:
			if(year%4==0 && year%100!=0 || year%400==0) {
				lastDay=29; //윤년
			}else {
				lastDay=28; //평년
			}
		}

		System.out.printf("%d년도 %d월의 마지막일은 %d입니다.\n", year, month, lastDay);

	}

}
