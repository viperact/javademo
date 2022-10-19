package java004_array;

public class Java044_array {
	public static void main(String[] args) {
		// 3행 2열의 2차원 배열
//		int[][] num = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
		int[][] num = new int[][] { { 1, 2 }, { 3, 4 }, { 5, 6 } }; // 배열의 크기를 지정하면안된다. 요소값들이 배열의 크기를 지정해주기때문

		for (int row = 0; row < num.length; row++) {
			for (int col = 0; col < num[row].length; col++) {
				System.out.printf("%4d", num[row][col]);
			}
			System.out.printf("\n");
		}

		System.out.println("==============================");
		for (int col = 0; col < 2; col++) {
			for (int row = 0; row < num.length; row++) {
				System.out.printf("%4d", num[row][col]);
			}
			System.out.printf("\n");

		}
		System.out.println("==============================");
		System.out.printf("%4d", num[0][0]);
		System.out.printf("%4d", num[1][0]);
		System.out.printf("%4d", num[2][0]);
		System.out.println();
		System.out.printf("%4d", num[0][1]);
		System.out.printf("%4d", num[1][1]);
		System.out.printf("%4d", num[2][1]);
		System.out.println();

		System.out.println("==============================");
		for (int col = 0; col < 2; col++) {
			System.out.printf("%4d", num[0][col]);
			System.out.printf("%4d", num[1][col]);
			System.out.printf("%4d", num[2][col]);
			System.out.println();
		}

		System.out.println("==============================");
		for (int col = 0; col < 2; col++) {
			for (int row = 0; row < 3; row++) {
				System.out.printf("%4d", num[row][col]);
			}

			System.out.println();
		}

	}// end main()

}// end class
