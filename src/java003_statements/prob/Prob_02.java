package java003_statements.prob;
/*
 * 
 * 2001부터 2012년사이에서 윤년을 구하시오 
 * 출력결과
 2004
 2008
 2012
 */

public class Prob_02 {

	public static void main(String[] args) {

		// 윤년 : year % 4 == 0 && year % 400 == 0
		// 평년 : year % 4 == 0 || year % 100 == 0
		int year = 0;
		for (int i = 0; i >= 2001 && i <= 2012; i++) {
			if (i % 4 == 0) {
				System.out.printf("%d", year);
				i++;
			}
		}

	}// end main()

}// end class
