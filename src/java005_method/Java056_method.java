package java005_method;

public class Java056_method {

	public static void main(String[] args) {
		// 값에 의한 복사 (call by value)
		int a = 10, b = 20;
		int c = a, d = b; // a저장소에 있는10이란 값이 그대로 c저장소에 복사 d도 마찬가지

		// c, d변수의 값을 교환
		int temp = c;
		c = d;
		d = temp;

		System.out.printf("a=%d, b=%d\n", a, b);
		System.out.printf("c=%d, d=%d\n", c, d);

		System.out.println("============================");

		int[] num = new int[] { 10, 20 }; // 참조데이터 타입
		//num은 기본데이터타입 int는 참조데이터타입
		int[] arr = num; //주소에 의한 복사 (call by reference)
		
		//arr[0], arr[1]을 값을 교환
		int imsi = arr[0];//10 // 임시로만든 기본데이터타입인 imsi에 참조데이터타입에 있는 arr의 0번째 index값을 복사
		arr[0] = arr[1]; // arr의 0번쨰 index에 arr의 1번째 index를 넣어라
		arr[1] = imsi;
		
		System.out.printf("num[0]=%d, num[1]=%d\n", num[0],num[1]);
		System.out.printf("arr[0]=%d, arr[1]=%d\n", arr[0],arr[1]);

	}

}




















