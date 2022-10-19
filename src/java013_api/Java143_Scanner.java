package java013_api;

import java.util.Scanner;

/*
 * 단입력: 5
 * 5 X 1 = 5
 * 5 X 2 = 10
 * . . .
 * 5 X 9 = 45
 * 계속하시겠습니까?(종료:n, 계속:아무키) n
 * 프로그램종료
 * 
 */

public class Java143_Scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//while() {} 프로그램이 언제 종료될지 정확한 시점을 모를때 사용함
		//while문의 조건이 true라면 무한반복
		//자바의 while문 조건식은 무조건 논리값 (true, false)
		while (true) {
			System.out.print("단 입력:");
			int dan = sc.nextInt();
			for (int i = 1; i < 10; i++) {
				System.out.printf("%d X %d = %d\n", dan, i, dan * i);
			}

			System.out.print("계속하시겠습니까?(종료:n, 계속:아무키): ");
			String chk = sc.next();
			// 문자열을 비교할땐 .equals 사용
			if (chk.equals("n")) {
				// if(chk=="n") {
				System.out.println("프로그램종료");
				break;
			}
		}

	}// end main()

}// end class
