package java004_array;

public class Java038_array {
	public static void main(String[] args) {
		// javascript의 배열표현
		// let myArray = [1, 2, 3, "홍길동", "아무개"];

		// java의 배열표현 (리터럴값으로 표현가능)
		int[] data = { 10, 20, 30 };
		// 배열의 초기값을 할당하면서 배열을 생성할때는 배열의 크기를 지정할 수 없다.
		// 배열의 초기값의 크기가 배열의 크기를 지정함
		int[] jumsu = new int[] { 90, 80, 40 };

		for (int i = 0; i < data.length; i++) {
			System.out.printf("jumsu[%d] : %d\n", i, jumsu[i]);
		}

		System.out.println("=========Reverse=============");
		for (int i = jumsu.length - 1; i >= 0; i--)
			System.out.printf("jumsu[%d] : %d\n", i, jumsu[i]);

	}
}
