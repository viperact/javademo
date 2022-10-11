package java005_method.prob;

/*
 * <<프로그램 실행결과 >>
 * 2 or 5의 배수가 아닌 갯수 : 7
 * 2 or 5의 배수가 아닌 합계 : 107
 */
public class Prob005_method {
	public static void main(String[] args) {
		int[] data = { 1, 3, 5, 8, 9, 11, 15, 19, 18, 20, 30, 33, 31 };
		result(data);
	}// end main()

	public static void result(int[] data) {
		// 여기에 2 or 5의 배수가 아닌 갯수와 합계를 구하는 코드를 작성하세요.

		int cnt = 0; // 2 or 5의 배수가 아닌 갯수
		int sum = 0; // 2 or 5의 배수가 아닌 합계

		// 조건식을 data[i]로 한 이유? 2와 5 두개중에 공통되는걸 골라야해서?
		for (int i = 0; i < data.length; i++) {
			if (data[i] % 2 != 0 && data[i] % 5 != 0) {
				cnt++;
				sum += data[i];
			}
		}

		System.out.printf("2 or 5의 배수가 아닌 갯수 : %d\n", cnt);
		System.out.printf("2 or 5의 배수가 아닌 합계 : %d", sum);
	}// end result()

}// end class
