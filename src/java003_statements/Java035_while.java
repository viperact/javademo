package java003_statements;

/*
 * while문의 조건식을 true로 놓으면 무한대
 */
public class Java035_while {
	public static void main(String[] args) {
		int cnt = 1;
		while (true) {
			System.out.println(cnt++);
			if (cnt == 6) {
				break;
			}
		}
	}
}
