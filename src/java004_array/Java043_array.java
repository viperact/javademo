package java004_array;

public class Java043_array {
	public static void main(String[] args) {
		// 2차원 배열

		// 3행 2열의 2차원 배열
		int[][] num = new int[3][2]; // 3 = 행 2 = 열
		System.out.printf("%4d", num[0][0]); // 0행 0열
		System.out.printf("%4d\n", num[0][1]); // 0행 1열

		System.out.printf("%4d", num[1][0]); // 1행 0열
		System.out.printf("%4d\n", num[1][1]); // 1행 1열

		System.out.printf("%4d", num[2][0]); // 2행 0열
		System.out.printf("%4d\n", num[2][1]); // 2행 1열

		num[0][0] = 1;
		num[0][1] = 2;
		num[1][0] = 3;
		num[1][1] = 4;
		num[2][0] = 5;
		num[2][1] = 6;

		System.out.println("====================================");
		// 2차원 배열에서 배열명.length = 행의 갯수를 리턴한다. (3)
		for (int row = 0; row < num.length; row++) {
			System.out.printf("%4d", num[row][0]);
			System.out.printf("%4d\n", num[row][1]);
		}

		System.out.println("====================================");
		for (int row = 0; row < num.length; row++) {
			// 배열명.[row].length :각 행에 대한 열의 갯수를 리턴한다 (2)
			for (int col = 0; col < num[row].length; col++) {
				System.out.printf("%4d", num[row][col]);
			}

//			System.out.println();
			System.out.printf("\n");
		}
	}

}
