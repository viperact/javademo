package java004_array;

public class Java051_array {
	public static void main(String[] args) {
		char[][] color = new char[3][];
		color[0] = new char[] { 'r', 'e', 'd' };
		// 0번째 행의 열의 크기는 3개
		color[1] = new char[] { 'g', 'r', 'e', 'e', 'n' };
		// 1번째 행의 열의 크기는 5개
		color[2] = new char[] { 'p', 'i', 'n', 'k' };
		// 2번째 행의 열의 크기는 4개

		for (int i = 0; i < color.length; i++) {
			for (int j = 0; j < color[i].length; j++) {
				System.out.printf("%4c", color[i][j]);
			}
			System.out.printf("\n");
		}
		
		System.out.println("============================");
		for(int i=0; i<color.length; i++) {
			System.out.println(color[i]);
		}

	}

}
