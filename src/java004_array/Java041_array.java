package java004_array;

public class Java041_array {
	public static void main(String[] args) {

		// 값을 설정하지 않았을경우의 기본값
		int[] data1 = new int[3]; // 0 기본값
		long[] data2 = new long[3]; // 0L 기본값 출력된 결과는 0 (바뀐다)
		float[] data3 = new float[3]; // 0.0F 결과값도 %f로 바꿔야함
		double[] data4 = new double[3]; // 0.0
		char[] data5 = new char[3]; // \u0000 (유니코드값) (비어있는 값) %c
		boolean[] data6 = new boolean[3]; // false (값이 지정안됐기 때문에) %d
		String[] data7 = new String[3]; // null %s

		for (int i = 0; i < data7.length; i++) {
			System.out.printf("data[%d]=%s\n", i, data7[i]);
//			System.out.println(data5[i]);
		}

		System.out.println("=============================");
		// https://www.techonthenet.com/unicode/chart.php
		// 유니코드값 비교
		char a = ' ';
		char b = '\u0020'; // 공백을 표현한 유니코드
		char c = '\u0000'; // 0값을표현한 유니코드
		char d = 0;

		System.out.println(a == b);
		System.out.println(c == d);
	}

}
