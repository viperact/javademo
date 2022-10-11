package java005_method;

public class Java055_method {

	public static void main(String[] args) {
		
		//참조데이터타입(Array)은 속성이 같아야 호출가능 int를 double로 호출하는것 등 변환하는건 불가능
		int a = 4, b = 2, c = 5;
		int[] num = new int[] { 2, 3 };
		int[] data = new int[] { 2, 6, 2, 8 };

		System.out.println(process(a, b, c)); // = 리턴값 (int x, int y, int z)
												// (a, b, c)
//		System.out.printlt(process2(a, b, c));
		
		System.out.println(plus(num));
		System.out.println(plus(data));
	}// end main()

	public static int process(int x, int y, int z) {
		return x + y + z;
	} // end process()

	public static void process2(int x, int y, int z) {
		System.out.println(x + y + z);
	}// end procees2

	public static int plus(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	} // end plus

}// end class()
