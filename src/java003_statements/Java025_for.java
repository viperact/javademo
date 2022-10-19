package java003_statements;

public class Java025_for {
	public static void main(String[] args) {

		// 누적된 값이 최초로 15이상일때 까지만 반복문을 수행

		int sum = 0;
		int i;

		for (i = 1;; i++) {
			// 조건식 생략 = 무한루프 (true의 상태)
			sum = sum + i;
			if (sum >= 15) {
				// sum이 15보다 커지거나 같아지면
				break;
				// 반복문을 빠져나와라
			}
		}
		System.out.printf("i=%d sum=%d\n", i, sum);
	}
}
