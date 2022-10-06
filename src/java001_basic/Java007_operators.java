package java001_basic;

public class Java007_operators {
	public static void main(String[] args) {

		int a = 10;
		int b = 3;
		System.out.println(a / b); // int/int => 3 int
		System.out.println((double) (a / b)); // 3.0 / (a/b)먼저 계산처리후 (double)로 바꿈
		System.out.println((double) a / b); // 3.333... / a = double로 변환 후 b로 나눔 / 10.0 / 3 = 3.333..
											// (double)a 먼저 처리후 b로 나눔

	}
}
