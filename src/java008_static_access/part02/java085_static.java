package java008_static_access.part02;

public class java085_static {
	int x = 3;
	static int y = 5;

	public static void main(String[] args) {
//		System.out.printf("x=%d\n", x);
		// x 는 static 선언이 안되있기 때문에 호출 불가
		System.out.printf("y=%d\n", y);
		// y 는 static 선언이 되있기 때문에 호출가능
//		process(); // non-static
		display(); // static
		java085_static js = new java085_static();
		js.process();

	}// end main()

	public void process() {
		System.out.println("process");
		System.out.printf("x=%d\n", x);
		//static 선언이 안되있는 곳에서는 호출 가능
		display(); // non-static 메소드에서 static메소드 호출 가능
	}// end process()

	public static void display() {
		System.out.println("display");
		// static 메소드에서는 static 메소드만 호출가능
	}// end display()
}
