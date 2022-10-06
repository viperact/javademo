package java003_statements;

public class Java028_for {
	public static void main(String[] args) {
		int sum = 0;
		for(int i=1; i<=10; i++) {
			sum += i;
		}
		System.out.printf("sum=%d\n", sum);
		//1~10 까지 더한값 출력 55
	}
}
