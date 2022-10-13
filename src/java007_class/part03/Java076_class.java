package java007_class.part03;

/*
 * [출력결과]
 * 10 + 3 = 13
 * 3 * 2 = 6
 */
public class Java076_class {

	public static void main(String[] args) {
		int[] left = { 10, 3 };
		int[] right = { 3, 2 };
		char[] ope = { '+', '*' }; // +, -, *, / 일때만

		Calc[] nfo = new Calc[2]; // 새로운 Calc의 배열 2개생성
		for (int i = 0; i < nfo.length; i++) {
			if(checkOperator(ope[i])) {
				return;
			};
			// 연산자가 +, -, *, / 일때만 출력하고, 나머지는 경고메세지를 출력하는 식 작성
			nfo[i] = new Calc(left[i], right[i], ope[i]);
			// 각 배열들에 변수값을 할당
		}

		prn(nfo);

	}// end main()

	//현재 데이터베이스에 저장된 내용을 출력하는 메소드
	public static void prn(Calc[] nfo) {
		for (int i = 0; i < nfo.length; i++) {
			System.out.println(nfo[i].toString());
		}
	}// end prn()

	//원하는 연산자만 저장하도록 하는 메소드 구현
	public static boolean checkOperator(char ope) {
		if (!(ope == '+' || ope == '-' || ope == '/' || ope == '*')) {
			System.out.println("+, -, /, * 연산자만 가능합니다.");
			return true;
		}
			return false;
	}// checkOperator()
}
