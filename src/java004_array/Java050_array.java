package java004_array;

/*
 * 가변배율
 * 
 * 2차원 배열 이상일때만 가변 가능
 * 앞의 행 값은 고정적으로 할당해줘야하고
 * 뒤의 열 값을 가변으로 정해줄 수 있음
 */
public class Java050_array {
	public static void main(String[] args) {
		// 가변배열을 생성할때는 제일 마지막의 배열크기는 지정하지 않는다. (열 값)
		// 가변배열을 제공하는 이유는 메모리 손실을 최소화 하기 위한 목적이다.

//		int[][] num = new int [3][];
//		num[0] = new int [2]; // 0행에 2열이 생성
//		num[1] = new int [3]; // 1행에 3열이 생성
//		num[2] = new int [5]; // 2행에 5열이 생성

		int[][] num = new int[][] { { 1, 2 }, { 3, 4, 5 }, { 6, 7, 8, 9, 10 } };
		// 중괄호 안의 괄호 : 행의개수 0행 2열 1행 3열 2행 5열
		// 중괄호 안의 괄호의 숫자들 : 열의수

		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				System.out.printf("%4d", num[i][j]);
			}
			System.out.printf("\n");
		}

	}
}
