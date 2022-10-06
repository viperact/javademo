package java001_basic;

public class Java005_print {
	public static void main(String[] args) {
		byte bNum = 2; // 1byte = -128 ~ 128
		short sNum = 4;
		int xNum = 5;
		long lNum = 6L; // L or l (대소문자 상관없음) l로 long함수라는걸 표시해야함
		float fNum = 2.5F; // F or f
		double dNum = 7.4;
		char cData = 'a'; // ' ' : 문자
		boolean eNum = true;
		String sData = "java"; // " " : 문자열 / ' '와 " " 는 저장되는영역 자체가 다름

		System.out.println(bNum + "," + sNum); // 2,4
		// + 기준 좌변이나 우변이 문자열, 문자라면 +가 연결연산자로 사용

		/*
		 * printf() : 출력형식을 바꿔줌 System.out.printf("출력형식", 값1, 값2, 값...) 
		 * 출력기호 : %d :정수(byte, short, int, long) %f : 실수(float, double) %b : 논리값(boolean) 
		 * %c : 문자(char) %s : 문자열(String) %% : %(기호그대로) \n : 줄바꿈 \t : 탭
		 * 
		 */

		System.out.printf("%d %d %d %d %f %f %b %c %s\n",
				bNum, sNum, xNum, lNum, fNum, dNum, eNum, cData, sData);
		//2 4 5 6 2.500000 7.400000 true a java
		
		System.out.printf("%d %% %d = %d\n", 5, 2, (5 % 2));
		//5 % 2 = 1

		System.out.printf("java");
		System.out.println("program");
		System.out.println();  //공백
		System.out.println("jsp");
		System.out.println("test");
		// println(); : 텍스트 자동 줄바꿈을 해줌

	}
}
